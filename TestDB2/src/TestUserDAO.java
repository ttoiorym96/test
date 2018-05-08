import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO {

	String name = "";
	String password = "";
	public void select(String name, String password) {
		DBConnector db = new DBConnector();//原本クラスをインスタンス化
		Connection con = db.getConnection();//原本クラスで取得したgetConnectionをconに代入。
		//Connectionは接続や切断を行う型。

		String sql = "select * from test_table where user_name = ? and password = ?";
		//テストというテーブルから、ユーザー名とパスワードを探すという1文。
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			//PreparedStatementはSQLの送信を行う型。
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			//ResultSetは検索結果を受け取る型。
			if(rs.next()) {//next()はResultSetされたものから、探し出すというイメージ。
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
				//取得したデータがもし見つかればコンソールに表示するというif文を用いた文。
			}
		}catch(SQLException e) {
			e.printStackTrace();//接続やSQL処理の失敗時の処理。
		}
		try {
			con.close();//切断する
		}catch(SQLException e) {
			e.printStackTrace();//切断失敗時の処理
		}
	}
	public void selectAll() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from test_table";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	try {
		con.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}

	public void selectByName(String name) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from test_table where user_name = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

	public void selectByPassword(String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from test_table where password = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateUserNameByUserName(String oldName, String newName) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "update test_table set user_name = ? where user_name = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,newName);
			ps.setString(2,oldName);
			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "件更新されました");
			}else {
				System.out.println("該当するデータはありませんでした");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(int user_id, String name, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "insert into test_table values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,user_id);
			ps.setString(2,name);
			ps.setString(3,password);
			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "件更新されました");
			}else {
				System.out.println("該当するデータはありませんでした");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(String name) {//delete文は削除する文。
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "delete from test_table where user_name = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,name);
			int i = ps.executeUpdate();
			if(i > 0) {//i > 0 はつまり、もし一件でも更新するならtrueと言う意味。
				System.out.println(i + "件削除されました");
			}else {
				System.out.println("該当するデータはありませんでした");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
