package main

// go get -u golang.org/x/net/ipv4
import (
	"fmt"
	"log"
	"net"

	"golang.org/x/net/ipv4"
)

func main() {
	fmt.Println("start udp server")

	ln, err := net.Listen("tcp", "127.0.0.1:55500")
	if err != nil {
		log.Fatal(err)
	}
	defer ln.Close()

	for {
		c, err := ln.Accept()
		if err != nil {
			log.Fatal(err)
		}
		go func(c net.Conn) {
			defer c.Close()
			if c.RemoteAddr().(*net.TCPAddr).IP.To4() != nil {
				p := ipv4.NewConn(c)
				if err := p.SetTOS(0x28); err != nil { // DSCP AF11
					log.Fatal(err)
				}
				if err := p.SetTTL(128); err != nil {
					log.Fatal(err)
				}
			}
			if _, err := c.Write([]byte("HELLO-R-U-THERE-ACK")); err != nil {
				log.Fatal(err)
			}
		}(c)
	}
}
