
https://access.redhat.com/sites/default/files/attachments/rh_yum_cheatsheet_1214_jcs_print-ja.pdf  


epel  
CentOSの標準では用意されていないパッケージをインストールすることができるようにするためのリポジトリらしい  



サブコマンド   
provides クエリしたファイルを提供するパッケージを検索する  
search その用語が含まれるパッケージ名と説明を検索する  


fuserコマンドは最小限installした場合はいっていない  
どのパッケージあるか調べるのに  
yum search fuser 

パッケージがわかったらinstallする
yum -y install psmisc  

