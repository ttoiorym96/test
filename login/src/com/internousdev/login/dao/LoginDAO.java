package com.internousdev.login.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;

public class LoginDAO {
	public LoginDTO select(String name, String password) throws SQLException{
		LoginDTO dto = new LoginDTO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		//userというテーブルから、ユーザー名とパスワードを探す
		String sql = "select * from user where user_name = ? and password = ?";

		try {
			//PreparedStatementはSQLの送信を行う型。
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,password);

			//ResultSetで結果を表す。
			ResultSet rs = ps.executeQuery();

			//結果からnext()で一致したデータを探し出す。
			if(rs.next()) {
				dto.setName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
			//finallyないの処理は、例外がなくても必ず実行される。
			//finallyはファイル・データベース接続/切断などの処理を行うべき状況の際必ず使う。
		}finally {
			con.close();
		}
		return dto;
	}

}
