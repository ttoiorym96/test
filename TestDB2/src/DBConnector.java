/**
 *
 */

/**
 * @author tto8569
 *
 */
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBConnector {


	//JDBCのドライバー名
	private static String driverName = "com.mysql.jdbc.Driver";

	//データベース接続URL
	private static String url = "jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

	//データベース接続ユーザー名
	private static String user = "root";

	//データベース接続パスワード

	private static String password = "mysql";

	public Connection getConnection() {
		//Connectionは接続や切断を行う型。
		Connection con = null;
		try {
			Class.forName(driverName);
			                  //( )内はJDBCドライバ名
			                  //Class.forNameはドライバを探す時に用いる。
			con = (Connection)DriverManager.getConnection(url,user,password);
			//接続先DBのurl、ユーザー名、パスワード。
		}catch(ClassNotFoundException e) {
			e.printStackTrace();//JDBCドライバが見つからない時の処理。
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
