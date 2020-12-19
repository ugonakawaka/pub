package main

/*
#cgo CFLAGS: -I .
#cgo LDFLAGS: -L . -lpcap_udp6 -lpcap

#include "pcap_udp6.h"

int callOnMeGo_cgo(int in, const unsigned char *p); // Forward declaration.
*/
import "C"

import (
	"encoding/hex"
	"fmt"
	"unsafe"
)

//export callOnMeGo
func callOnMeGo(in int, packet *C.uchar) int {
	// fmt.Printf("Go.callOnMeGo(): called with arg = %d\n", in)

	fmt.Println("ok udp")
	arr := C.GoBytes(unsafe.Pointer(packet), 1024)

	fmt.Printf("%s", hex.Dump(arr))
	fmt.Println("")

	return in + 1
}

func main() {
	fmt.Printf("Go.main(): calling C function with callback to us\n")
	var ifc *C.char = C.CString("enp0s3")
	var prot *C.char = C.CString("udp port 55501")
	// C.start("enp0s3", "udp", (C.callback_fcn)(unsafe.Pointer(C.callOnMeGo_cgo)))
	C.start(ifc, prot, (C.callback_fcn)(unsafe.Pointer(C.callOnMeGo_cgo)))
}
