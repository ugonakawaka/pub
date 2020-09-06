package main

import (
	"fmt"
	"log"
	"net"
)

func main() {
	fmt.Println("start udp server")

	// udpAddr := &net.IPAddr{
	// 	IP: net.ParseIP("127.0.0.1"),
	// }

	netaddr, _ := net.ResolveIPAddr("ip4:udp", "127.0.0.1")

	updLn, err := net.ListenIP("ip:udp", netaddr)
	if err != nil {
		// log.Fatalln(err)
		panic(err)
	}

	buf := make([]byte, 64)

	for {
		n, addr, err := updLn.ReadFromIP(buf)
		if err != nil {
			log.Fatalln(err)
		}

		go func() {
			log.Printf("From: %v Reciving data: %s", addr.String(), string(buf[:n]))
		}()
	}
}
