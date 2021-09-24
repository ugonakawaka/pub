KVM（Kernel-based Virtual Machine）  

CPUの確認(仮想化支援機能を搭載したCPU)  
grep -E --color 'vmx|svm' /proc/cpuinfo  
egrep '(vmx|svm)' /proc/cpuinfo  



ハイパバイザの確認  
  
dmesg | grep 'Hypervisor detected'  


