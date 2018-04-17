package com.internousdev.login.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/logindb";

	private static String user = "root";
	private static String password = "mysql";

	public Connection getConnection() {
		/* 接続を表すConnectionオブジェクトを初期化。 */
		Connection con = null;

		try {
			/* jdbcドライバを読み込んでいる。引数にはデータベースにアクセスする為のjdbcのドライバ名。 */
			Class.forName(driverName);

			/* DriverManagerクラスのgetConnectionメソッドをconnection型にキャストしてデータベースに接続。 */
			con = (Connection)DriverManager.getConnection(url,user,password);

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
