package site1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import site1.dto.LoginCompleteDTO;
import site1.util.DBConnector;

public class LoginCompleteDAO {

	public LoginCompleteDTO select(String password, String name) throws SQLException{



	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	LoginCompleteDTO dto = new LoginCompleteDTO();

	String sql = "select * from login_user_transaction where login_pass=? and user_name=?";

	try {
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1,password);
		ps.setString(2,name);

		ResultSet rs = ps.executeQuery();

		if(rs.next()) {
			dto.setPassword(rs.getString("login_pass"));
			dto.setUserName(rs.getString("user_name"));
		}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		con.close();
	}

	return dto;


	}

}
