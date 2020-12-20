#
java:
	javac UDPIPV4TosClient.java
clean:
	rm -f UDPIPV4TosClient*class
	rm -f *_tm.txt
	rm -f pcap_ipv4_udp
	go clean
go:
	go build -o raw_conn_ipv4_udp comm.go raw_conn_ipv4_udp.go
	go build -o raw_sock_ipv4_udp comm.go raw_sock_ipv4_udp.go
	go build -o pkt_dtgrm_ipv4_udp comm.go pkt_dtgrm_ipv4_udp.go
	gcc -c pcap_ipv4_udp.c -lpcap
	ar -cr libpcap_ipv4_udp.a pcap_ipv4_udp.o
	go build -o pcap_ipv4_udp cfuncs.go comm.go pcap_ipv4_udp_go.go 