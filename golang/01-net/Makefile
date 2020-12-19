#
all:
	gcc -c pcap_udp6.c -lpcap
	ar -cr libpcap_udp6.a pcap_udp6.o
	go build pcap_udp6_go.go  cfuncs.go
