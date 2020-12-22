
### usage
`./raw_sock_ipv4_udp -addr 192.168.1.6 -name raw_sock_udp -b true`  
`./raw_conn_ipv4_udp -addr 192.168.1.6 -name raw_conn_ipv4_udp -b true`  
`./pcap_ipv4_udp -addr 192.168.1.6 -name pcap_ipv4_udp -dev enp0s3 -b true`  
`./pkt_dtgrm_ipv4_udp -addr 192.168.1.6 -name pkt_dtgrm_ipv4_udp -dev enp0s3 -b true`  

`./raw_sock_ipv4_udp  -addr 192.168.1.6 -name "raw_sock_udp      " -b true |tee  raw_sock_udp_tm.txt`  
`./raw_conn_ipv4_udp  -addr 192.168.1.6 -name "raw_conn_ipv4_udp " -b true |tee  raw_conn_ipv4_udp_tm.txt`  
`./pcap_ipv4_udp      -addr 192.168.1.6 -name "pcap_ipv4_udp     " -dev enp0s3 -b true |tee  pcap_ipv4_udp_tm.txt`  
`./pkt_dtgrm_ipv4_udp -addr 192.168.1.6 -name "pkt_dtgrm_ipv4_udp" -dev enp0s3 -b true |tee  pkt_dtgrm_ipv4_udp_tm.txt`  

`java -cp . UDPIPV4TosClient 101 192.168.1.6`  

### nc command
$ nc -4 -u 192.168.1.6 55501 -T 7  

### find process
ps aux|egrep "raw|pkt|pcap"  


### link
http://www5d.biglobe.ne.jp/stssk/rfc/rfc2553j.html  
http://www5d.biglobe.ne.jp/stssk/rfc/rfc2292j.html  

tcpdump  
https://www.tcpdump.org/manpages/pcap.3pcap.html  
https://github.com/the-tcpdump-group/libpcap/blob/master/pcap/pcap.h  

golang  
https://golang.org/pkg/syscall/  

https://github.com/osrg/goplane/blob/master/netlink/pf_packet.go  


linux  
https://github.com/torvalds/linux/blob/master/include/uapi/linux/if_ether.h  

blog  
https://oraccha.hatenadiary.org/entry/20100108/1262886720  

https://blog.tiqwab.com/2019/06/03/socket-domain-type.html  

java  
https://docs.oracle.com/javase/jp/8/docs/api/java/net/DatagramSocket.html#getTrafficClass--  
