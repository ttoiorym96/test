package com.internousdev.vague.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.vague.dto.LoginUserDTO;
import com.internousdev.vague.util.DBConnector;

public class LoginDAO {

	public LoginUserDTO getLoginUserInfo(String loginUserId, String loginPassword) {

	     DBConnector db = new DBConnector();
	     Connection con = db.getConnection();
	     LoginUserDTO loginUserDTO = new LoginUserDTO();


		String sql = "select * from login_user_transaction where login_id=? and login_pass=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,loginUserId);
			ps.setString(2,loginPassword);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				loginUserDTO.setUserId(rs.getString("login_id"));
				loginUserDTO.setPassword(rs.getString("login_pass"));
				loginUserDTO.setFirstName(rs.getString("user_name"));

			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return loginUserDTO;
	}

}
