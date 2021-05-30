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

	"golang.org/x/net/ipv4"
	// "golang.org/x/net/internal/socket"
)

func main() {
	flag.Parse()
	fmt.Println(*AppName, *Port, *Dev, *b)

	ifindex := 0
	if *Dev != "" {
		intf, err := net.InterfaceByName(*Dev)
		if err != nil {
			log.Fatalln(err)
		}
		ifindex = intf.Index
	}

	fd, err := syscall.Socket(syscall.AF_PACKET, syscall.SOCK_DGRAM, syscall.ETH_P_IP)
	if err != nil {
		log.Fatalln(err)
	}

	sll := syscall.RawSockaddrLinklayer{
		Family:   syscall.AF_PACKET,
		Protocol: htons(uint16(syscall.ETH_P_IP)),
		// sll_ifindex 0 matches any interface (only permitted forbinding).
		Ifindex: int32(ifindex),
	}

	_, _, err = syscall.Syscall(syscall.SYS_BIND, uintptr(fd),
		uintptr(unsafe.Pointer(&sll)), unsafe.Sizeof(sll))
	if errors.Is(err, os.ErrNotExist) {
		log.Fatalln(err)
	}

	syscall.SetsockoptInt(fd, syscall.SOL_SOCKET, syscall.SO_RCVBUF, 3)

	value, _ := syscall.GetsockoptInt(fd, syscall.SOL_SOCKET, syscall.SO_RCVBUF)
	log.Println(value)

	for {
		buf := make([]byte, 1500)
		n, _, err := syscall.Recvfrom(fd, buf, syscall.MSG_TRUNC)
		if err != nil {
			log.Fatalln(err)
		}
		// fmt.Printf("%s", hex.Dump(buf))
		// fmt.Println("")
		// log.Fatalln(err)
		go func() {

			// ipheader
			iph, err := ipv4.ParseHeader(buf)
			if err != nil {
				// do nothing
				return
			}

			// udpheader
			endudp4h := ipv4.HeaderLen + UDPHeaderLen
			uDPHeader, err := ParseUDPHeader(buf[ipv4.HeaderLen:endudp4h])
			if err != nil {
				// do nothing
				return
			}

			// 自分あてのポートでないとはじく
			if uDPHeader.DestinationPort != *Port {
				// do nothing
				return
			}
			udpPayload := string(buf[endudp4h:n])
			if *b {
				udpPayload = strings.TrimRight(udpPayload, "\n")
			}
			PrintEvi(*AppName, *Addr, uDPHeader.DestinationPort, iph.TOS, udpPayload)
		}()
	}

}
