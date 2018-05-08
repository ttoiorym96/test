set names utf8;
set foreign_key_checks = 0;
drop database if exists Vague;

create database if not exists Vague DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;

use Vague;

/*
*宛先情報テーブル
*/

drop table if exists destination_info;

create table destination_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null,
	family_name varchar (32) not null,
	first_name varchar (32) not null,
	family_name_kana varchar (32) not null,
	first_name_kana varchar (32) not null,
	email varchar (32) not null,
	tel_number varchar (13) not null,
	postal_code varchar (8) not null,
	user_address varchar (50) not null,
	insert_date datetime not null,
	update_date datetime
);

/*
 * テスト用にログインユーザーテーブル作成
 */
drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

insert into login_user_transaction(login_id,login_pass,user_name)values("aaa","aaa","aaa");
insert into login_user_transaction(login_id,login_pass,user_name)values("xxx","xxx","xxx");

