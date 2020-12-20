#include <pcap.h>
#ifndef PCAP_IPV4_UDP_H
#define PCAP_IPV4_UDP_H
typedef void (*callback_fcn)(uint, uint, const unsigned char*);
typedef void (*callback_fcn2)(unsigned char*, const struct pcap_pkthdr*, const unsigned char*);
// void some_c_func(callback_fcn);
// void some_c_func2(callback_fcn2);
int start(char*, char*, int, callback_fcn);
int start2(char*, char*, int, callback_fcn2);
#endif
