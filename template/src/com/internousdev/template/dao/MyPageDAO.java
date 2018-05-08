package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.dto.MyPageDTO;
import com.internousdev.template.util.DBConnector;

public class MyPageDAO {

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	MyPageDTO myPageDTO = new MyPageDTO();

	public MyPageDTO getMyPageUserInfo(String item_transaction_id, String user_master_id)throws SQLException{

//		left joinを用いる事で、複数のテーブルを結合することができる。
//		そして、ユーザー情報と履歴情報を紐付けし一括して取得している。
		String sql = "select item_info_transaction.item_name, user_buy_item_transaction.total_price, user_buy_item_transaction.total_count, user_buy_item_transaction.pay from"
				+ "user_buy_item_transaction user_buy_item_transaction left join item_info_transaction on"
				+ "user_buy_item_transaction,item_transaction_id = item_info_transaction.id where user_buy_item_transaction.item_transaction_id = ? and"
				+ "user_buy_item_transaction.user_master_id = ? order by user_buy_item_transaction.insert_date desc";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,item_transaction_id);
			ps.setString(2,user_master_id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				myPageDTO.setItemName(rs.getString("item_name"));
				myPageDTO.setTotalPrice(rs.getString("total_price"));
				myPageDTO.setTotalCount(rs.getString("total_count"));
				myPageDTO.setPayment(rs.getString("pay"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return myPageDTO;
	}

	public int buyItemHistoryDelete(String item_transaction_id, String user_master_id)throws SQLException{
		String sql = "delete from user_buy_item_transaction where item_transaction_id = ? and user_master_id = ?";
		PreparedStatement ps;
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,item_transaction_id);
			ps.setString(2,user_master_id);

			result = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return result;
	}

}
