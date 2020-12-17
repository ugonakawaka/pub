#ifndef PCAP_UDP6_H
#define PCAP_UDP6_H
typedef int (*callback_fcn)(int, const unsigned char*);
void some_c_func(callback_fcn);
int start(char*, char*, callback_fcn);
#endif
