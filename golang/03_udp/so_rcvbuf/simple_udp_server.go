package main

import (
	"fmt"
	"log"
	"net"
	"sync/atomic"
)

var (
	cnt uint64
)

func printcnt() {
	go func() {
		cmd := ""
		for {
			fmt.Scan(&cmd)
			if cmd == "p" {
				log.Println(cnt)
			}
		}

	}()
}
func main() {

	printcnt()

	udpAddr := &net.UDPAddr{
		IP:   net.ParseIP("192.168.1.6"),
		Port: 55501,
	}
	updLn, err := net.ListenUDP("udp", udpAddr)

	if err != nil {
		log.Fatalln(err)
	}

	buf := make([]byte, 1024)

	for {
		_, _, err := updLn.ReadFromUDP(buf)
		if err != nil {
			log.Fatalln(err)
		}

		go func() {
			atomic.AddUint64(&cnt, 1)
		}()
	}
}
