set names utf8;
set foreign_key_checks = 0;
drop database if exists creates;
create database if not exists creates;
use creates;

create table new_users(
id int not null primary key auto_increment,
login_id varchar(16),
password varchar(16),
login_name varchar(50),
insert_date datetime,
update_date datetime
);

insert into new_users(login_id,password,login_name)values("iriyama","58","test");