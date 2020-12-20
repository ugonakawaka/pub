
### usage
`./raw_sock_ipv4_udp -addr 192.168.1.6 -name raw_sock_udp -b true`  
`./raw_conn_ipv4_udp -addr 192.168.1.6 -name raw_conn_ipv4_udp -b true`  
`./pcap_ipv4_udp -addr 192.168.1.6 -name pcap_ipv4_udp -dev enp0s3 -b true`  
`./pkt_dtgrm_ipv4_udp -addr 192.168.1.6 -name pkt_dtgrm_ipv4_udp -dev enp0s3 -b true`  

### nc command
$ nc -4 -u 192.168.1.6 55501 -T 7  

### link
http://www5d.biglobe.ne.jp/stssk/rfc/rfc2553j.html  
http://www5d.biglobe.ne.jp/stssk/rfc/rfc2292j.html  

https://www.tcpdump.org/manpages/pcap.3pcap.html  

https://github.com/the-tcpdump-group/libpcap/blob/master/pcap/pcap.h  

https://golang.org/pkg/syscall/  



https://github.com/osrg/goplane/blob/master/netlink/pf_packet.go


