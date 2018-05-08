package create.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import create.util.DBConnector;
import create.util.DateUtil;

public class UserCreateCompleteDAO {

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	DateUtil dateUtil = new DateUtil();

	String sql = "insert into new_users(login_id, password, login_name, insert_date)values(?,?,?,?)";

	public void user_info(String loginUserId, String loginPass, String userName) throws SQLException{

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,loginUserId);
			ps.setString(2,loginPass);
			ps.setString(3,userName);
			ps.setString(4,dateUtil.getDate());
			ps.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

}
