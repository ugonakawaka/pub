
https://access.redhat.com/sites/default/files/attachments/rh_yum_cheatsheet_1214_jcs_print-ja.pdf  


epel  
CentOSの標準では用意されていないパッケージをインストールすることができるようにするためのリポジトリらしい  

yum list installed|grep epel-release  




サブコマンド   
provides クエリしたファイルを提供するパッケージを検索する  
search その用語が含まれるパッケージ名と説明を検索する  


fuserコマンドは最小限installした場合はいっていない  
どのパッケージあるか調べるのに  
yum search fuser 

パッケージがわかったらinstallする
yum -y install psmisc  

インストール・アップデートの履歴がわかる  
yum history list  

インストール済みのパッケージ  
yum list installed  

インストール可能なもの(バージョン違い)  
yum search kubernetes --showduplicates  
