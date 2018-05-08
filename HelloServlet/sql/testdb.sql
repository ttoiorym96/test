/*drop文は消すという意味。existsは存在するという英単語。
 * なので、最初の一文は、もし、testbdというdbがすでに存在している場合、消します。という意味の一文になる。
 * */
drop database if exists testdb;

/* create database testbdという一文は、testdbというdbを作りますという意味。*/
create database testdb;

/* use testdbはtestdbを使いますという意味。*/
use testdb;

/*create table test_tableはtest_tableというテーブルをtestdb内に作るという意味。
 * さらに、test_tableの()内にカラム名int型 or varchar型を書く事で、このテーブルにはこのカラムがありますという事。
 * テーブルとそのテーブルに入っているカラムは一文で作成できるが、この段階では、カラムには何の情報も入っていない。 */
create table test_table(user_id int, user_name varchar(255), password varchar(255));


/*insert into文を使うとテーブル内にあるカラムに情報を加えることが出来る。
 * insert intp test_table value(1,"taro","123")この一文はtest_tableにあるカラムに
 * createで作ったカラム順に対応するように情報を入れている。int型の所にvarchar型入れる（例えば、idの箇所にtaroを入れる）と
 * エラーになるので注意。*/
insert into test_table values(1,"taro","123");
insert into test_table values(2,"jiro","456");
insert into test_table values(3,"hanako","789");