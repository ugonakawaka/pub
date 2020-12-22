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

int start(char *dev, char *filter, int bufsize, callback_fcn callback) {
  pcap_t *handle;
  const unsigned char *packet;
  char errbuf[PCAP_ERRBUF_SIZE];
  struct pcap_pkthdr header;
  struct bpf_program bpfp;
  bpf_u_int32 net;

  if ((handle = pcap_create(dev, errbuf)) == NULL) {
    fprintf(stderr, "Failed pcap_create %s: %s\n", dev, errbuf);
    exit(EXIT_FAILURE);
  }

  // if (pcap_set_promisc(handle, 0) != 0) {
  //   fprintf(stderr, "Failed pcap_set_promisc: %s\n", pcap_geterr(handle));
  //   exit(EXIT_FAILURE);
  // }

  // if (pcap_set_timeout(handle, 1) != 0) {
  //   fprintf(stderr, "Failed pcap_set_timeout: %s\n", pcap_geterr(handle));
  //   exit(EXIT_FAILURE);
  // }

  if (pcap_set_immediate_mode(handle, 1) != 0) {
    fprintf(stderr, "Failed pcap_set_immediate_mode: %s\n", pcap_geterr(handle));
    exit(EXIT_FAILURE);
  }

  // PCAP_TSTAMP_HOST_LOWPREC relatively cheap to fetch
  if (pcap_set_tstamp_precision(handle, PCAP_TSTAMP_HOST_LOWPREC) != 0) {
    fprintf(stderr, "Failed pcap_set_tstamp_precision: %s\n", pcap_geterr(handle));
    exit(EXIT_FAILURE);
  }

  // if (pcap_set_datalink(handle, DLT_EN10MB) != 0) {
  //   fprintf(stderr, "Failed pcap_set_datalink: %s\n", pcap_geterr(handle));
  //   exit(EXIT_FAILURE);
  // }

  if (pcap_activate(handle) != 0) {
    fprintf(stderr, "Failed pcap_activate: %s\n", pcap_geterr(handle));
    exit(EXIT_FAILURE);
  }

  if (pcap_compile(handle, &bpfp, filter, 0, net) != 0) {
    fprintf(stderr, "Failed pcap_compile: %s\n", pcap_geterr(handle));
    return -1;
  }

  if (pcap_setfilter(handle, &bpfp) != 0) {
    fprintf(stderr, "Failed pcap_setfilter: %s\n", pcap_geterr(handle));
    return -1;
  }

  // printf("ok5\n");

  while (1) {
    
    if ((packet = pcap_next(handle, &header)) == NULL)
      continue;

    if (header.len < sizeof(struct ether_header) + sizeof(struct ip))
      continue;

      callback(header.caplen, header.len, packet);
  }

  pcap_close(handle);
  return 0;
}

int start2(char *dev, char *filter, int bufsize, callback_fcn2 callback) {
  pcap_t *handle;
  const unsigned char *packet;
  char errbuf[PCAP_ERRBUF_SIZE];
  struct pcap_pkthdr header;
  struct bpf_program bpfp;
  bpf_u_int32 net;

  if ((handle = pcap_create(dev, errbuf)) == NULL) {
    fprintf(stderr, "Failed pcap_create %s: %s\n", dev, errbuf);
    exit(EXIT_FAILURE);
  }

  // if (pcap_set_promisc(handle, 1) != 0) {
  //   fprintf(stderr, "Failed pcap_set_promisc: %s\n", pcap_geterr(handle));
  //   exit(EXIT_FAILURE);
  // }

  // if (pcap_set_timeout(handle, -100) != 0) {
  //   fprintf(stderr, "Failed pcap_set_timeout: %s\n", pcap_geterr(handle));
  //   exit(EXIT_FAILURE);
  // }

  if (pcap_set_immediate_mode(handle, 1) != 0) {
    fprintf(stderr, "Failed pcap_set_immediate_mode: %s\n", pcap_geterr(handle));
    exit(EXIT_FAILURE);
  }

  // PCAP_TSTAMP_HOST_LOWPREC relatively cheap to fetch
  if (pcap_set_tstamp_precision(handle, PCAP_TSTAMP_HOST_LOWPREC) != 0) {
    fprintf(stderr, "Failed pcap_set_tstamp_precision: %s\n", pcap_geterr(handle));
    exit(EXIT_FAILURE);
  }

  // if (pcap_set_snaplen(handle, 100) != 0) {
  //   fprintf(stderr, "Failed pcap_set_snaplen: %s\n", pcap_geterr(handle));
  //   exit(EXIT_FAILURE);
  // }


  // if (pcap_set_datalink(handle, DLT_EN10MB) != 0) {
  //   fprintf(stderr, "Failed pcap_set_datalink: %s\n", pcap_geterr(handle));
  //   exit(EXIT_FAILURE);
  // }

  // if (pcap_setnonblock(handle, 1, errbuf) != 0) {
  //   fprintf(stderr, "Failed pcap_setnonblock: %s, %s\n", pcap_geterr(handle), errbuf);
  //   exit(EXIT_FAILURE);
  // }


  if (pcap_activate(handle) != 0) {
    fprintf(stderr, "Failed pcap_activate: %s\n", pcap_geterr(handle));
    exit(EXIT_FAILURE);
  }

  if (pcap_compile(handle, &bpfp, filter, 0, net) != 0) {
    fprintf(stderr, "Failed pcap_compile: %s\n", pcap_geterr(handle));
    return -1;
  }

  if (pcap_setfilter(handle, &bpfp) != 0) {
    fprintf(stderr, "Failed pcap_setfilter: %s\n", pcap_geterr(handle));
    return -1;
  }

  // printf("ok7\n");
  pcap_loop(handle, 0, callback, NULL);
  
  return 0;
}
