package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	public String execute() {
		String result = "login";
				//ログイン判定を行う
//				ログインしている場合はそのまま商品画面に移動させる。
				if(session.containsKey("id")) {
					BuyItemDAO buyItemDAO = new BuyItemDAO();
					BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
					session.put("id",buyItemDTO.getId());
					session.put("buyItem_name",buyItemDTO.getItemName());
					session.put("buyItem_price",buyItemDTO.getItemPrice());
					result = SUCCESS;
				}
		return result;
	}

	@Override
	public void setSession(Map<String,Object>session) {
		this.session = session;
	}

	public Map<String,Object> getSession(){
		return this.session;
	}

}
