package main

/*

#include <stdio.h>

// The gateway function
int callOnMeGo_cgo(int in, const unsigned char *p)
{
	// printf("C.callOnMeGo_cgo(): called with arg = %d\n", in);
	int callOnMeGo(int, const unsigned char*);
	return callOnMeGo(in, p);
}
*/
import "C"
