package create.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {

	public static String driverName = "com.mysql.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost/creates";//※最後はデータベース名
	public static String user = "root";
	public static String pass = "mysql";

	public Connection getConnection() {
		Connection con = null;

		try {
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(url,user,pass);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
