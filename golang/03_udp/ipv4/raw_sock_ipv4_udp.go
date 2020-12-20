package main

import (
	"flag"
	"fmt"
	"log"
	"strings"
	"syscall"

	"golang.org/x/net/ipv4"
	// "golang.org/x/net/internal/socket"
)

// build go build -o raw_sock_ipv4_udp comm.go raw_sock_ipv4_udp.go
func main() {
	flag.Parse()
	fmt.Println(*AppName, *Port, *Addr, *b)

	b4 := ParseIPV4Addr(*Addr)
	sa := &syscall.SockaddrInet4{
		Addr: b4,
		Port: *Port,
	}

	fd, err := syscall.Socket(syscall.AF_INET, syscall.SOCK_RAW, syscall.IPPROTO_UDP)
	if err != nil {
		log.Fatalln(err)
	}

	err = syscall.Bind(fd, sa)
	if err != nil {
		log.Fatalln(err)
	}

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
