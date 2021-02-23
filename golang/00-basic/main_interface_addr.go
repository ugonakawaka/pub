package main

import (
	"fmt"
	"net"
)

// MyAddr my addr
type MyAddr struct {
	Addr string
	Port int
}

func (a *MyAddr) Network() string {
	return "ok"
}

func (a *MyAddr) String() string {
	return a.Addr + ":" + string(a.Port)
}

func main() {

	var addr net.Addr
	myaddr := new(MyAddr)
	myaddr.Port = 55501
	myaddr.Addr = "127.0.0.1"

	addr = myaddr
	fmt.Println(addr)
}
