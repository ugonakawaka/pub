sed は stream editor  である  

オプションと編集コマンドに分かれる  

sed [オプション] 編集コマンド [ファイル名]  

- オプション  

\

- コマンド  
s/regexp/replacement/  

↓同じことしてる  
sed y/ab/AB/ test.txt  
sed -e s/a/A/g -e s/b/B/g test.txt  
