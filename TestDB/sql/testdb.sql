drop database if exists testdb;/*ここではもしtestdbがあればdrop(消す)という意味。existsは（存在するという意味）*/
create database testdb;/*createを用いてデータベースを作成。 */
use testdb;

create table test_table(user_id int, user_name varchar(255), password varchar(255));

insert into test_table values(1,"taro","123");
insert into test_table values(2,"jiro","456");
insert into test_table values(3,"hanako","789");
