

ホストOSでInsert Guest Addion CD する  

mount -r /dev/cdrom /mnt/cdrom/  
sh /mnt/cdrom/VBoxLinuxAdditions.run  
↑このスクリプトでインストールする  

※install したcentosによってはいろいろインストールしないといけないかもしれない  

https://www.dev2qa.com/how-to-resolve-virtualbox-guest-additions-kernel-headers-not-found-for-target-kernel-error/  

yum install -y bzip2
yum -y install gcc
yum -y intall kernel-headers
yum install "kernel-devel-uname-r == $(uname -r)"


