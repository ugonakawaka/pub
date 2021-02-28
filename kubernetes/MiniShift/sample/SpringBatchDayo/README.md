### 説明
spring batchの簡単なサンプル  


- [spring-guides/gs-batch-processing: Creating a Batch Service :: Learn how to create a basic batch-driven solution.](https://github.com/spring-guides/gs-batch-processing)



- [spring-batch/spring-batch-samples/src/main/java/org/springframework/batch/sample/config at master · spring-projects/spring-batch](https://github.com/spring-projects/spring-batch/tree/master/spring-batch-samples/src/main/java/org/springframework/batch/sample/config)  

- [EnableBatchProcessing](https://www.baeldung.com/introduction-to-spring-batch)  



### SampleDbをつくる

mysqlの再起動  
service mysql restart  

ユーザー一覧  
select user,host from mysql.user;   


ユーザ名@ホスト名とするところをユーザ名だけにすれば、どこからもアクセスできるユーザを作ることができる  

mysql> create user ユーザ名 identified by 'password';  

権限の確認(ユーザ@ホスト名)  
mysql> show grants for 'root'@'%';  


作成したユーザに管理者権限   
mysql> GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;  

全権限をあたえる  
GRANT ALL PRIVILEGES ON データベース名.テーブル名 TO 'ユーザ名'@'ホスト名' IDENTIFIED BY 'パスワード';  



外部ホストからの接続を許可する  
$ sudo -e /etc/mysql/mysql.conf.d/mysqld.cnf  

mysql> create database sampledb;  


サンプルテーブル  
https://github.com/datacharmer/test_db


VIEWをのぞく  
mysql> select TABLE_SCHEMA ,TABLE_NAME, TABLE_TYPE from INFORMATION_SCHEMA.TABLES where TABLE_TYPE <> 'VIEW';  
