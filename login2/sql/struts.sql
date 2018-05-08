set names utf8;
set foreign_key_checks = 0;

drop database if exists logindb2;
create database if not exists logindb2;
use logindb2;

create table user(id int, user_name varchar(50), password varchar(50));

insert into user values
(1,"taro","123"),
(2,"jiro","456");
