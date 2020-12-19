package main

import (
	"flag"
	"fmt"
	"log"
	"net"

	"golang.org/x/net/ipv4"
)

// build
// go build raw_conn_ipv4_udp.go comm.go

// このサンプルは、
func main() {
	flag.Parse()
	fmt.Println(*Port, *Addr, *b)

	PrintTime()
	fmt.Println("start udp server")

	// udpAddr := &net.IPAddr{
	// 	IP: net.ParseIP("127.0.0.1"),
	// }

	// NG laddr, err := net.ResolveIPAddr("ip4:udp", "127.0.0.1:55501")
	// NG panic: lookup 127.0.0.1:55501: no such host

	// OK
	laddr, err := net.ResolveIPAddr("ip4:udp", *Addr)
	if err != nil {
		panic(err)
	}

	ln, err := net.ListenIP("ip:udp", laddr)
	if err != nil {
		panic(err)
	}

	raw, err := ipv4.NewRawConn(ln)
	if err != nil {
		panic(err)
	}

	buf := make([]byte, 1500)

	for {
		iph, p /*cm *ControlMessage*/, _, err := raw.ReadFrom(buf)

		if err != nil {
			log.Fatalln(err)
		}
		// fmt.Printf("%s", hex.Dump(buf))
		// fmt.Printf("%s", hex.Dump(p))

		go func() {
			uDPHeader, err := ParseUDPHeader(p)
			if err != nil {
				// do nothing
				return
			}
			// 自分あてのポートでないとはじく
			if uDPHeader.DestinationPort != *Port {
				// do nothing
				return
			}
			// log.Printf("From: %v Reciving data: %s", h, string(p))
			udpPayload := string(p[UDPHeaderLen:])
			PrintEvi(*AppName, *Addr, uDPHeader.DestinationPort, iph.TOS, udpPayload)
		}()
	}
}
