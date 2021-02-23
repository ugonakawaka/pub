package main

import (
	"fmt"
	"net"
	"strconv"
)

// MyAddr my addr
type MyAddr struct {
	Addr string
	Port int
}

// Network これは、net.Addrをみたす
func (a *MyAddr) Network() string {
	return a.Addr + ":" + strconv.Itoa(a.Port)
}

// String これは、net.Addrをみたす
func (a *MyAddr) String() string {
	return a.Network()
}

func main() {
	// golangのインターフェイスの実験
	// net.Addrを満たすものを用意する
	var addr net.Addr
	myaddr := new(MyAddr)
	myaddr.Port = 55501
	myaddr.Addr = "127.0.0.1"

	addr = myaddr
	fmt.Println(addr)
}
