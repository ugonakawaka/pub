// ugonakawaka
package main

import (
	"encoding/binary"
	"encoding/hex"
	"errors"
	"flag"
	"fmt"
	"net"
	"time"
)

/* このソースは共通だよー */

// https://github.com/torvalds/linux/blob/master/include/uapi/linux/if_ether.h
const (
	// PF_PACKET linux/if_ether.h
	PF_PACKET = 17
	// PACKET_BROADCAST
	PACKET_BROADCAST = 1 //
	// PACKET_MR_PROMISC
	PACKET_MR_PROMISC = 1 //
	// ETH_P_ALL
	ETH_P_ALL = 0x0003
	// ETH_P_IP
	ETH_P_IP = 0x0800
	// ETH_P_IPV6
	ETH_P_IPV6 = 0x86DD
)

func htons(host uint16) uint16 {
	return (host&0xff)<<8 | (host >> 8)
}

// ===================
// run application

var (
	// AppName application name
	AppName = flag.String("name", "TEST UDP SERVER", "application name")
	// Port port
	Port = flag.Int("port", 55501, "message receive port")
	// Addr address
	Addr = flag.String("addr", "127.0.0.1", "message receive address")
	// Dev target device
	Dev = flag.String("dev", "eth0", "libpcap use target device")
	b   = flag.Bool("b", false, "payload trim right side LF")
)

// NanoFormat japanese like this format
const NanoFormat = "2006/01/02 15:04:05.000000000"

// PrintTime report func
func PrintTime() {

	t := time.Now()
	// RFC3339Nano = "2006-01-02T15:04:05.999999999Z07:00"

	fmt.Printf("%s\n", t.Format(NanoFormat))
}

// PrintTime2 report func
func PrintTime2(s string) {

	t := time.Now()
	// RFC3339Nano = "2006-01-02T15:04:05.999999999Z07:00"

	fmt.Printf("%s\t%s\n", t.Format(NanoFormat), s)
}

// PrintEvi taa sss
func PrintEvi(name string, addr string, port int, tos int, payload string) {
	t := time.Now()
	fmt.Printf("%s\t%s\t%s\t%d\t%d\t[%s]\n", t.Format(NanoFormat), name, addr, port, tos, payload)
}

// HeavyWeight blocking process check
func HeavyWeight() {
	var t = time.Now()
	fmt.Printf("%s *** HeavyWeight start\n", t.Format(NanoFormat))
	j := 0
	for i := 0; i < 100000000000; i++ {
		j = j + 1
	}
	t = time.Now()
	fmt.Printf("%s *** HeavyWeight %f end\n", t.Format(NanoFormat), j)

}

// PrintHexDump hex dump
func PrintHexDump(b []byte, n int) {
	fmt.Printf("%s", hex.Dump(b[:n]))
}

// ===================
// helper functions

// ParseIPV4Addr byte4 addr
func ParseIPV4Addr(saddr string) [4]byte {
	ip := net.ParseIP(saddr)
	b4 := [4]byte{}
	copy(b4[:], ip)
	return b4
}

// ===================
// udp

// header
const (
	EthernetFrameHeaderLen = 14
	UDPHeaderLen           = 8
)

// UDPHeader udp header
type UDPHeader struct {
	SourcePort      int
	DestinationPort int
	Length          int
	Checksum        int
}

//  package err definition
var (
	ErrNotDestPort    = errors.New("recv port not dest port")
	ErrInvalidConn    = errors.New("invalid connection")
	ErrMissingAddress = errors.New("missing address")
	ErrNilHeader      = errors.New("nil header")
	ErrHeaderTooShort = errors.New("header too short")
)

// ParseUDPHeader RFC 768
func ParseUDPHeader(b []byte) (*UDPHeader, error) {
	if b == nil {
		return nil, ErrNilHeader
	}
	if len(b) < UDPHeaderLen {
		return nil, ErrHeaderTooShort
	}
	h := new(UDPHeader)

	h.SourcePort = int(binary.BigEndian.Uint16(b[0:2]))
	h.DestinationPort = int(binary.BigEndian.Uint16(b[2:4]))
	h.Length = int(binary.BigEndian.Uint16(b[4:6]))
	h.Checksum = int(binary.BigEndian.Uint16(b[6:8]))
	return h, nil
}
