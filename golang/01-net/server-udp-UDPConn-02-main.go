package main

import (
	"encoding/binary"
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
	updConn, err := net.ListenUDP("udp", udpAddr)
	if err != nil {
		log.Fatalln(err)
	}

	buf := make([]byte, 64)
	oob := make([]byte, 64)

	bs := make([]byte, 4)

	for {
		n, oobn, flags, addr, err := updConn.ReadMsgUDP(buf, oob)
		if err != nil {
			log.Fatalln(err)
		}

		go func() {

			log.Printf("From: %v oobn:%d Reciving data: %s", addr.String(), oobn, string(buf[:n]))
			binary.BigEndian.PutUint32(bs, uint32(flags))
			log.Printf("%d %s", flags, bs)
		}()
	}
}
