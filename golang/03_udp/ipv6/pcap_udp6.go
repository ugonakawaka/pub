package main

/*
#cgo CFLAGS: -I .
#cgo LDFLAGS: -L . -lpcap_udp -lpcap

#include "pcap_udp6.h"
// Forward declaration.
void callbackPcap_cgo(unsigned char* useless, const struct pcap_pkthdr* pkthdr, const unsigned char* packet);
*/
import "C"

import (
	"flag"
	"fmt"
	"strconv"
	"strings"
	"unsafe"

	"golang.org/x/net/ipv6"
)

//export callbackPcap
func callbackPcap(useless *C.uchar, pkthdr *C.struct_pcap_pkthdr, packet *C.uchar) {
	caplen := uint(pkthdr.caplen)
	len := uint(pkthdr.len)
	processPcap(caplen, len, packet)
}

func processPcap(caplen uint, len uint, packet *C.uchar) {
	// copy first
	clen := C.int(len)
	buf := C.GoBytes(unsafe.Pointer(packet), clen)
	go func() {

		// version check
		ipvers := buf[EthernetFrameHeaderLen]

		if ipvers != 0x60 {
			// do nothing
			return
		}

		iph, err := ipv6.ParseHeader(buf[EthernetFrameHeaderLen:])
		// fmt.Println(iph)

		if err != nil {
			// do nothing
			return
		}

		// udpheader
		startudp6h := EthernetFrameHeaderLen + ipv6.HeaderLen
		endudp6h := startudp6h + UDPHeaderLen

		uDPHeader, err := ParseUDPHeader(buf[startudp6h:])
		if err != nil {
			// do nothing
			return
		}
		// payloadlen = udp header len + udp payload len
		n := EthernetFrameHeaderLen + ipv6.HeaderLen + iph.PayloadLen
		udpPayload := string(buf[endudp6h:n])
		if *b {
			udpPayload = strings.TrimRight(udpPayload, "\n")
		}
		PrintEvi(*AppName, *Addr, uDPHeader.DestinationPort, iph.TrafficClass, udpPayload)

	}()
}
func main() {

	flag.Parse()
	fmt.Println(*AppName, *Port, *Addr, *b, *Dev)

	PrintTime()

	var sfilter = "udp and port %PORT% and dst host %HOST%"
	// var sfilter = "udp and port %PORT%"
	sfilter = strings.Replace(sfilter, "%PORT%", strconv.Itoa(*Port), -1)
	sfilter = strings.Replace(sfilter, "%HOST%", *Addr, -1)
	fmt.Println(sfilter)
	var dev *C.char = C.CString(*Dev)
	var filter *C.char = C.CString(sfilter)
	// go func() {
	C.start(dev, filter, 1500, 1, (C.callback_fcn)(unsafe.Pointer(C.callbackPcap_cgo)))
	// }()

}
