package main

import (
	"fmt"
	"log"
	"net"
)

func main() {
	fmt.Println("start udp server")

	udpAddr := &net.UDPAddr{
		IP:   net.ParseIP("localhost"),
		Port: 55500,
	}
	updLn, err := net.ListenUDP("udp", udpAddr)
	if err != nil {
		log.Fatalln(err)
	}

	buf := make([]byte, 64)

	for {
		n, addr, err := updLn.ReadFromUDP(buf)
		if err != nil {
			log.Fatalln(err)
		}

		go func() {
			log.Printf("From: %v Reciving data: %s", addr.String(), string(buf[:n]))
		}()
	}
}
