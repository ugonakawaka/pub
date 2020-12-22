#
java:
	javac UDPTosClient.java
clean:
	rm -f UDP*class
	rm -f *_tm.txt
	rm -f pcap_udp6
	go clean
go:
	# go build -o raw_conn_ipv6_udp comm.go raw_conn_ipv4_udp.go
	# go build -o raw_sock_ipv4_udp comm.go raw_sock_ipv4_udp.go
	go build -o pkt_dtgrm_udp6 comm.go pkt_dtgrm_udp6.go
	gcc -c pcap_udp6.c -lpcap
	ar -cr libpcap_udp.a pcap_udp6.o
	go build -o pcap_udp6 cfuncs.go comm.go pcap_udp6.go 
