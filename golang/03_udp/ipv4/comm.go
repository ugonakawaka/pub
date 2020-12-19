// ugonakawaka
package main

import (
	"encoding/binary"
	"errors"
	"flag"
	"fmt"
	"time"
)

/* このソースは共通だよー */

// ===================
// run application

var (
	// AppName application name
	AppName = flag.String("app", "TEST UDP SERVER", "application name")
	// Port port
	Port = flag.Int("int", 55501, "message receive port")
	// Addr address
	Addr = flag.String("addr", "127.0.0.1", "message receive address")
	b    = flag.Bool("bool", false, "bool flag")
)

// NanoFormat japanese like this format
const NanoFormat = "2006/01/02 15:04:05.000000000"

// PrintTime report func
func PrintTime() {

	t := time.Now()
	// RFC3339Nano = "2006-01-02T15:04:05.999999999Z07:00"

	fmt.Printf("%s\n", t.Format(NanoFormat))
}

// PrintEvi taa sss
func PrintEvi(name string, addr string, port int, tos int, payload string) {
	t := time.Now()
	fmt.Printf("%s\t%s\t%s\t%d\t%d\t[%s]", t.Format(NanoFormat), name, addr, port, tos, payload)
}

// ===================
// udp

// header
const (
	UDPHeaderLen = 8
)

// UDPHeader udp header
type UDPHeader struct {
	SourcePort      int
	DestinationPort int
	Length          int
	Checksum        int
}

//  package err definition
var (
	ErrNotDestPort    = errors.New("recv port not dest port")
	ErrInvalidConn    = errors.New("invalid connection")
	ErrMissingAddress = errors.New("missing address")
	ErrNilHeader      = errors.New("nil header")
	ErrHeaderTooShort = errors.New("header too short")
)

// ParseUDPHeader RFC 768
func ParseUDPHeader(b []byte) (*UDPHeader, error) {
	if b == nil {
		return nil, ErrNilHeader
	}
	if len(b) < UDPHeaderLen {
		return nil, ErrHeaderTooShort
	}
	h := new(UDPHeader)

	h.SourcePort = int(binary.BigEndian.Uint16(b[0:2]))
	h.DestinationPort = int(binary.BigEndian.Uint16(b[2:4]))
	h.Length = int(binary.BigEndian.Uint16(b[4:6]))
	h.Checksum = int(binary.BigEndian.Uint16(b[6:8]))
	return h, nil
}
