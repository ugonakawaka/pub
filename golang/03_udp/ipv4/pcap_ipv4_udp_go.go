package main

/*
#cgo CFLAGS: -I .
#cgo LDFLAGS: -L . -lpcap_ipv4_udp -lpcap

#include "pcap_ipv4_udp.h"
// Forward declaration.
void callbackPcap_cgo(unsigned char* useless, const struct pcap_pkthdr* pkthdr, const unsigned char* packet);
int callOnMeGo_cgo(uint caplen, uint len, const unsigned char *p);
*/
import "C"

import (
	"flag"
	"fmt"
	"strconv"
	"strings"
	"unsafe"

	"golang.org/x/net/ipv4"
)

//export callbackPcap
func callbackPcap(useless *C.uchar, pkthdr *C.struct_pcap_pkthdr, packet *C.uchar) {
	// PrintTime2("loop")
	caplen := uint(pkthdr.caplen)
	len := uint(pkthdr.len)
	processPcap(caplen, len, packet)

}

//export callOnMeGo
func callOnMeGo(caplen uint, len uint, packet *C.uchar) int {
	// PrintTime2("next")
	processPcap(caplen, len, packet)
	return 0
}

func processPcap(caplen uint, len uint, packet *C.uchar) {
	go func() {
		// fmt.Printf("Go.callOnMeGo(): called with caplen = %d, len = %d\n", caplen, len)

		// fmt.Printf("%s", hex.Dump(buf))
		// fmt.Println("")

		clen := C.int(len)
		buf := C.GoBytes(unsafe.Pointer(packet), clen)
		iph, err := ipv4.ParseHeader(buf[EthernetFrameHeaderLen:])
		if err != nil {
			// do nothing
			return
		}
		// fmt.Println(iph)
		n := EthernetFrameHeaderLen + iph.TotalLen
		// udpheader
		startudp4h := EthernetFrameHeaderLen + ipv4.HeaderLen
		endudp4h := startudp4h + UDPHeaderLen

		uDPHeader, err := ParseUDPHeader(buf[startudp4h:])
		if err != nil {
			// do nothing
			return
		}
		udpPayload := string(buf[endudp4h:n])
		if *b {
			udpPayload = strings.TrimRight(udpPayload, "\n")
		}
		PrintEvi(*AppName, *Addr, uDPHeader.DestinationPort, iph.TOS, udpPayload)

	}()
}
func main() {

	flag.Parse()
	fmt.Println(*AppName, *Port, *Addr, *b, *Dev)

	PrintTime()

	var sfilter = "udp and port %PORT% and dst host %HOST%"
	sfilter = strings.Replace(sfilter, "%PORT%", strconv.Itoa(*Port), -1)
	sfilter = strings.Replace(sfilter, "%HOST%", *Addr, -1)
	fmt.Println(sfilter)
	var dev *C.char = C.CString(*Dev)
	var filter *C.char = C.CString(sfilter)
	// go func() {
	// 	C.start2(dev, filter, 1500, (C.callback_fcn2)(unsafe.Pointer(C.callbackPcap_cgo)))
	// }()
	// go func() {
	C.start(dev, filter, 1500, (C.callback_fcn)(unsafe.Pointer(C.callOnMeGo_cgo)))
	// }()
}
