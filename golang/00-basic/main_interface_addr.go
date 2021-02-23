package main

import (
	"fmt"
	"net"
	"strconv"
)

// MyAddr my addr
type MyAddr struct {
	Version int
	Addr    string
	Port    int
}

// Network これは、net.Addrをみたす
func (a *MyAddr) Network() string {
	return "udp"
}

// String これは、net.Addrをみたす
func (a *MyAddr) String() string {

	if a.Version == 4 {
		return a.Addr + ":" + strconv.Itoa(a.Port)
	} else if a.Version == 6 {
		return "[" + a.Addr + "]:" + strconv.Itoa(a.Port)
	}

	return "error"
}

func main() {
	// golangのインターフェイスの実験
	// net.Addrを満たすものを用意する

	{
		var addr net.Addr
		myaddr := new(MyAddr)
		myaddr.Version = 4
		myaddr.Port = 55501
		myaddr.Addr = "127.0.0.1"

		addr = myaddr
		fmt.Println(addr)
		udp, err := net.ResolveUDPAddr("udp", addr.String())
		fmt.Println(udp)
		fmt.Println(err)
	}
	{
		var addr net.Addr
		myaddr := new(MyAddr)
		myaddr.Version = 6
		myaddr.Port = 55501
		myaddr.Addr = "::1"
		addr = myaddr
		fmt.Println(addr)
		udp, err := net.ResolveUDPAddr("udp", addr.String())
		fmt.Println(udp)
		fmt.Println(err)
	}
}
