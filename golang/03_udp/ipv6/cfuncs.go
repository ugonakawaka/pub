package main

/*

#include <stdio.h>
#include <pcap.h>

// The gateway function
void callbackPcap_cgo(unsigned char* useless, const struct pcap_pkthdr* pkthdr, const unsigned char* packet)
{
	void callbackPcap(unsigned char*, const struct pcap_pkthdr*, const unsigned char*);
	callbackPcap(useless, pkthdr, packet);
}
*/
import "C"
