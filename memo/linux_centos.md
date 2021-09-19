

virtual boxでminimalで  
yumがうまくいってなくて調べて  

↓を追加して  
NETWORKING_IPV6=no  

reboot  
systemctl restart network  

=====  
ifconfigがない場合  
$ yum install net-tools  


=====  
最新dockerのインストール  
https://docs.docker.com/engine/install/centos/  
