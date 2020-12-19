#ifndef PCAP_IPV4_UDP_H
#define PCAP_IPV4_UDP_H
typedef int (*callback_fcn)(int, int, const unsigned char*);
void some_c_func(callback_fcn);
int start(char*, char*, int, callback_fcn);
#endif
