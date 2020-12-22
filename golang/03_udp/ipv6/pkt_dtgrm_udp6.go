package main

import (
	"errors"
	"flag"
	"fmt"
	"log"
	"net"
	"os"
	"strings"
	"syscall"
	"unsafe"

	"golang.org/x/net/ipv6"
	// "golang.org/x/net/internal/socket"
)

// build go build -o raw_sock_ipv4_udp comm.go raw_sock_ipv4_udp.go
func main() {
	flag.Parse()
	fmt.Println(*AppName, *Port, *Addr, *b)

	// b4 := ParseIPV4Addr(*Addr)
	// sa := &syscall.SockaddrInet4{
	// 	Addr: b4,
	// 	Port: *Port,
	// }

	ifname := *Dev
	intf, err := net.InterfaceByName(ifname)

	fd, err := syscall.Socket(PF_PACKET, syscall.SOCK_DGRAM, int(htons(ETH_P_IP)))
	if err != nil {
		log.Fatalln(err)
	}

	// err = syscall.Bind(fd, sa)
	// if err != nil {
	// 	log.Fatalln(err)
	// }

	sll := syscall.RawSockaddrLinklayer{
		Family: PF_PACKET,
		// bug? Protocol: htons(ETH_P_IP),
		Protocol: htons(ETH_P_ALL),
		Ifindex:  int32(intf.Index),
	}

	_, _, err = syscall.Syscall(syscall.SYS_BIND, uintptr(fd),
		uintptr(unsafe.Pointer(&sll)), unsafe.Sizeof(sll))
	if errors.Is(err, os.ErrNotExist) {
		log.Fatalln(err)
	}

	for {
		buf := make([]byte, 1500)
		n, _, err := syscall.Recvfrom(fd, buf, syscall.MSG_TRUNC)
		if err != nil {
			log.Fatalln(err)
		}

		ipvers := buf[0]

		if ipvers != 0x60 {
			// do nothing
			continue
		}

		// fmt.Printf("%d\n", n)
		// fmt.Printf("%s", hex.Dump(buf))
		// fmt.Println("")
		// log.Fatalln(err)

		// version check

		iph, err := ipv6.ParseHeader(buf)
		if err != nil {
			// do nothing
			continue
		}

		startudp6h := ipv6.HeaderLen
		endudp6h := startudp6h + UDPHeaderLen

		uDPHeader, err := ParseUDPHeader(buf[startudp6h:])
		if err != nil {
			// do nothing
			continue
		}
		// 自分あてのポートでないとはじく
		if uDPHeader.DestinationPort != *Port {
			// do nothing
			continue
		}

		// payloadlen = udp header len + udp payload len
		m := ipv6.HeaderLen + iph.PayloadLen

		if n < m {
			continue
		}
		go func() {

			udpPayload := string(buf[endudp6h:n])
			if *b {
				udpPayload = strings.TrimRight(udpPayload, "\n")
			}
			PrintEvi(*AppName, *Addr, uDPHeader.DestinationPort, iph.TrafficClass, udpPayload)
		}()
	}

}
