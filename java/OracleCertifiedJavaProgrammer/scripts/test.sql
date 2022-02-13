create table aaa (
 id integer  DEFAULT 0 NOT NULL AUTO_INCREMENT
 ,comment varchar(255)
 ,time timestamp not null, primary key (id));

insert into aaa(comment, time) values('test1', CURRENT_TIMESTAMP());
insert into aaa(comment, time) values('test2', CURRENT_TIMESTAMP());
commit;