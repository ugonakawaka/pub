//
#include <netinet/ip.h>
#include <netinet/ip6.h>
#include <pcap.h>
#include <stdio.h>
#include <stdlib.h>
#ifndef __FAVOR_BSD
#define __FAVOR_BSD
#endif
#include <arpa/inet.h>
#include <net/ethernet.h>
#include <netinet/udp.h>

#include "pcap_udp6.h"

static void print_udpheader(struct ip *ip) {
  struct udphdr *udp;

  udp = (struct udphdr *)((char *)ip + (ip->ip_hl << 2));
  printf("uh_sport = %d\n", ntohs(udp->uh_sport));
  printf("uh_dport = %d\n", ntohs(udp->uh_dport));
  printf("uh_ulen = %d bytes\n", ntohs(udp->uh_ulen));
  printf("uh_sum = 0x%.4x\n", ntohs(udp->uh_sum));
  printf("\n\n");
}

static int print_ipheader(char *p) {
  struct ip *ip;

  ip = (struct ip *)p;
  // if (ip->ip_v != 0x6) { return 0; }
  printf("ip_v   = 0x%x\n", ip->ip_v);
  printf("ip_hl  = 0x%x\n", ip->ip_hl);
  printf("ip_tos = 0x%.2x\n", ip->ip_tos);
  printf("ip_len = %d bytes\n", ntohs(ip->ip_len));
  printf("ip_id  = 0x%.4x\n", ntohs(ip->ip_id));
  printf("ip_off = 0x%.4x\n", ntohs(ip->ip_off));
  printf("ip_ttl = 0x%.2x\n", ip->ip_ttl);
  printf("ip_p   = 0x%.2x\n", ip->ip_p);
  printf("ip_sum = 0x%.4x\n", ntohs(ip->ip_sum));
  printf("ip_src = %s\n", inet_ntoa(ip->ip_src));
  printf("ip_dst = %s\n", inet_ntoa(ip->ip_dst));
  printf("\n");

  print_udpheader(ip);

  switch (ip->ip_p) {
  case IPPROTO_UDP:
  case IPPROTO_TCP:
  case IPPROTO_ICMP:
  default:
    break;
  }

  return 1;
}

int start(char *dev, char *filter, callback_fcn callback) {
  pcap_t *handle;
  const unsigned char *packet;
  char errbuf[PCAP_ERRBUF_SIZE];
  struct pcap_pkthdr header;
  struct bpf_program bpfp;
  bpf_u_int32 net;

  /* 受信用のデバイスを開く */
  if ((handle = pcap_open_live(dev, BUFSIZ, 1, 1000, errbuf)) == NULL) {
    fprintf(stderr, "Couldn't open device %s: %s\n", dev, errbuf);
    exit(EXIT_FAILURE);
  }
  /* ether only */
  if (pcap_datalink(handle) != DLT_EN10MB) {
    fprintf(stderr, "Device not support: %s\n", dev);
    exit(EXIT_FAILURE);
  }

  /* パケットフィルター設定 */
  if (pcap_compile(handle, &bpfp, filter, 0, net) == -1) {
    fprintf(stderr, "Couldn't parse filter: %s\n", pcap_geterr(handle));
    return -1;
  }
  if (pcap_setfilter(handle, &bpfp) == -1) {
    fprintf(stderr, "Couldn't install filter: %s\n", pcap_geterr(handle));
    return -1;
  }

  /* ループでパケットを受信 */
  while (1) {
    if ((packet = pcap_next(handle, &header)) == NULL)
      continue;

    /* イーサネットヘッダーとIPヘッダーの合計サイズに満たなければ無視 */
    if (header.len < sizeof(struct ether_header) + sizeof(struct ip))
      continue;
    int isUdp = print_ipheader((char *)(packet + sizeof(struct ether_header)));

    if (callback != 0 && isUdp == 1) {
      callback(2, packet);
    }
  }

  /* ここに到達することはない */
  pcap_close(handle);
  return 0;
}
