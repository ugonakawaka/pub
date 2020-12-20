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
		Family:   PF_PACKET,
		Protocol: htons(ETH_P_IP),
		Ifindex:  int32(intf.Index),
	}

	_, _, err = syscall.Syscall(syscall.SYS_BIND, uintptr(fd),
		uintptr(unsafe.Pointer(&sll)), unsafe.Sizeof(sll))
	if errors.Is(err, os.ErrNotExist) {
		log.Fatalln(err)
	}

	for {
		buf := make([]byte, 1500)
		_, _, err := syscall.Recvfrom(fd, buf, syscall.MSG_TRUNC)
		if err != nil {
			log.Fatalln(err)
		}
		// fmt.Printf("%s", hex.Dump(buf))
		// fmt.Println("")
		// log.Fatalln(err)

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
			continue
		}

		// 自分あてのポートでないとはじく
		if uDPHeader.DestinationPort != *Port {
			// do nothing
			continue
		}

		go func() {

			// ipheader
			// iph, err := ipv4.ParseHeader(buf)
			// if err != nil {
			// 	// do nothing
			// 	return
			// }

			// // udpheader
			// endudp4h := ipv4.HeaderLen + UDPHeaderLen
			// uDPHeader, err := ParseUDPHeader(buf[ipv4.HeaderLen:endudp4h])
			// if err != nil {
			// 	// do nothing
			// 	return
			// }

			// // 自分あてのポートでないとはじく
			// if uDPHeader.DestinationPort != *Port {
			// 	// do nothing
			// 	return
			// }
			tlen := iph.TotalLen
			udpPayload := string(buf[endudp4h:tlen])
			if *b {
				udpPayload = strings.TrimRight(udpPayload, "\n")
			}
			PrintEvi(*AppName, *Addr, uDPHeader.DestinationPort, iph.TOS, udpPayload)
		}()
	}

}
