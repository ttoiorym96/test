set names utf8;
set foreign_key_checks = 0;

drop database if exists site1;

create database if not exists site1;
use site1;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

insert into login_user_transaction(login_id,login_pass,user_name)values(1,"123","taro");