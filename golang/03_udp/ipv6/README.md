### ping6
ping6 -I enp0s3 fe80::2:544e:b026:a16b  
ping6 -I en1  fe80::a00:27ff:fecd:b9ac%enp0s3 

### nc
nc -6 -u fe80::a00:27ff:fecd:b9ac%en1 55501  

### ip
ip address show dev enp0s3  
