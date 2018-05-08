package site1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import site1.util.DBConnector;
import site1.util.DateUtil;

public class UserCreateCompleteDAO {

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	DateUtil dateUtil = new DateUtil();

	String sql = "insert into login_user_transaction(login_id,login_pass,user_name,insert_date)values(?,?,?,?)";

	public void user_info(String id, String password, String name) throws SQLException{

		try {

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,id);
			ps.setString(2,password);
			ps.setString(3,name);
			ps.setString(4,dateUtil.getDate());
			ps.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}


}
