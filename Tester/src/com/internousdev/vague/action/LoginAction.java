package com.internousdev.vague.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.vague.dao.LoginDAO;
import com.internousdev.vague.dto.LoginUserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;

	LoginDAO loginDAO = new LoginDAO();
	LoginUserDTO loginUserDTO = new LoginUserDTO();

	public String execute() {

//		DBに検索をかけて受け取った値をloginDTOに入れる
		loginUserDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);

		session.put("LoginUserDTO",loginUserDTO);

		String result = SUCCESS;

		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

}
