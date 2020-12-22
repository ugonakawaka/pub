#include <pcap.h>
#ifndef PCAP_UDP6_H
#define PCAP_UDP6_H
typedef void (*callback_fcn)(unsigned char*, const struct pcap_pkthdr*, const unsigned char*);
int start(char*, char*, int, int, callback_fcn);
#endif
