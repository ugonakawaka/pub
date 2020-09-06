package main

import (
	"fmt"
	"log"
	"net"
)

func main() {
	fmt.Println("start udp server")

	conn, err := net.ListenPacket("udp", ":55500")
	if err != nil {
		log.Fatalln(err)
	}

	buf := make([]byte, 64)

	for {
		n, addr, err := conn.ReadFrom(buf)
		if err != nil {
			log.Fatalln(err)
		}

		go func() {
			log.Printf("From: %v Reciving data: %s", addr.String(), string(buf[:n]))
		}()
	}
}
