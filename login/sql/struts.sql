/* サーバーの文字コード設定 */
set names utf8;

/* これをする事により、データベースとテーブルが外部キーにより紐付けされている場合、外部キーの制約を無視してdropする事が出来る。
 * 今回は外部キーは設定されていないがされていた場合を想定して書かれている。*/
set foreign_key_checks = 0;
drop database if exists logindb;
create database logindb;
use logindb;

create table user(id int, user_name varchar(255), passqword varchar(255));

insert into user values(1,"taro","123"),(2,"jiro","123"),(3,"hanako","123"),(4,"saburo","123");