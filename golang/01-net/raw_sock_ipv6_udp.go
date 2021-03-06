// 2020/11/23
//
//
package main

import (
	"encoding/binary"
	"encoding/hex"
	"errors"
	"fmt"
	"log"
	"net"
	"syscall"

	"golang.org/x/net/ipv4"
	"golang.org/x/net/ipv6"
	// "golang.org/x/net/internal/socket"
)

func main() {
	s := "fe80::a00:27ff:fecd:b9ac%en1"
	// s := "240d:2:7b00:ff00:a00:27ff:fecd:b9ac"
	// s := "::1"
	ip := net.ParseIP(s)
	fmt.Println(ip)
	ba, _ := ip.To16().MarshalText()
	fmt.Println(ba)
	b16 := [16]byte{}
	copy(b16[:], ip)
	sa := &syscall.SockaddrInet6{
		// Addr: [16]byte{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
		Addr: b16,
		Port: 55501,
	}
	fmt.Println(sa)
	cnn, err := NewConn(sa)
	if err != nil {
		log.Fatalln(err)
	}

	defer cnn.Close()

	for {
		b := make([]byte, 256)
		_, _, err := syscall.Recvfrom(cnn.fd, b, syscall.MSG_TRUNC)
		if err != nil {
			log.Fatalln(err)
		}
		fmt.Printf("%s", hex.Dump(b))
		fmt.Println("")
		// log.Fatalln(err)
	}

}

//
func NewConn(sa syscall.Sockaddr) (*Conn, error) {
	fd, err := syscall.Socket(syscall.AF_INET6, syscall.SOCK_RAW, syscall.IPPROTO_UDP)
	if err != nil {
		return nil, err
	}

	syscall.SetsockoptInt(fd, syscall.IPPROTO_IPV6, syscall.IPV6_RECVRTHDR, 1)
	err = syscall.Bind(fd, sa)
	if err != nil {
		return nil, err
	}

	cnn := &Conn{
		fd:      fd,
		sa:      sa,
		handler: handler{fd, sa},
	}
	return cnn, nil
}

// ===================
// helper

//  package err definition
var (
	ErrNotDestPort    = errors.New("recv port not dest port")
	ErrInvalidConn    = errors.New("invalid connection")
	ErrMissingAddress = errors.New("missing address")
	ErrNilHeader      = errors.New("nil header")
	ErrHeaderTooShort = errors.New("header too short")
)

// ===================
// header
const (
	HeaderLen = 8
)

type IpHeader struct {
	Ipv4Header *ipv4.Header
	Ipv6Header ipv6.Header
}
type UdpHeader struct {
	SourcePort      int
	DestinationPort int
	Length          int
	Checksum        int
}

func (h *UdpHeader) String() string {
	if h == nil {
		return "<nil>"
	}
	return fmt.Sprintf("srcport=%d dstport=%d len=%d Checksum=%#x", h.SourcePort, h.DestinationPort, h.Length, h.Checksum)
}

// RFC 768
func ParseUDPHeader(b []byte) (*UdpHeader, error) {
	if b == nil {
		return nil, ErrNilHeader
	}
	if len(b) < HeaderLen {
		return nil, ErrHeaderTooShort
	}
	h := new(UdpHeader)

	h.SourcePort = int(binary.BigEndian.Uint16(b[0:2]))
	h.DestinationPort = int(binary.BigEndian.Uint16(b[2:4]))
	h.Length = int(binary.BigEndian.Uint16(b[4:6]))
	h.Checksum = int(binary.BigEndian.Uint16(b[6:8]))
	return h, nil
}

// ===================
// packet
type handler struct {
	fd int
	sa syscall.Sockaddr
}

func (c *handler) ok() bool { return c != nil }

//
func (c *handler) ReadFrom(b []byte) (h *IpHeader, uh *UdpHeader, p []byte, err error) {

	h, uh, p, err = c.ReadAllFrom(b)
	if err != nil {
		switch err {
		case ErrNotDestPort:
			return h, uh, p, nil
		default:
			return h, uh, p, err
		}
	}
	return h, uh, p, nil
}

//
func (c *handler) ReadAllFrom(b []byte) (h *IpHeader, uh *UdpHeader, p []byte, err error) {
	if !c.ok() {
		return nil, nil, nil, ErrInvalidConn
	}

	n, _, err := syscall.Recvfrom(c.fd, b, syscall.MSG_TRUNC)

	if err != nil {
		return nil, nil, nil, err
	}

	// TODO: select ipv4 ipv6
	// total header len
	thlen := (20 + 8)

	// header size check
	if n < thlen { // ipv4
		return nil, nil, nil, ErrHeaderTooShort
	}

	// ipheader
	iph, err := ipv4.ParseHeader(b)
	if err != nil {
		return nil, nil, nil, err
	}

	h = &IpHeader{Ipv4Header: iph}

	// udp header
	uh, err = ParseUDPHeader(b[20:])
	if err != nil {
		return h, nil, nil, err
	}

	// payload size
	plen := func() int {

		lb := len(b)
		if iph.TotalLen < lb {
			return iph.TotalLen - thlen
		} else {
			return lb - thlen
		}
	}()

	pb := b[thlen:(thlen + plen)]
	// select port
	rcvport := getPort(c.sa)
	if rcvport != uh.DestinationPort {
		return h, uh, pb, ErrNotDestPort
	}

	return h, uh, pb, nil
}

func getPort(sa syscall.Sockaddr) int {
	switch sa.(type) {
	case *syscall.SockaddrInet4: //
		return sa.(*syscall.SockaddrInet4).Port
	case *syscall.SockaddrInet6: //
		return sa.(*syscall.SockaddrInet6).Port
	default:
	}
	return -1
}

// ===================
// endpoint
type Conn struct {
	// genericOpt
	fd int
	sa syscall.Sockaddr
	handler
}

// Close
func (c *Conn) Close() error {
	if !c.handler.ok() {
		return ErrInvalidConn
	}
	return syscall.Close(c.fd)
}

// ===================
