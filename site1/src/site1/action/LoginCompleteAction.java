package site1.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import site1.dao.LoginCompleteDAO;
import site1.dto.LoginCompleteDTO;


public class LoginCompleteAction extends ActionSupport implements SessionAware{

	private String password;
	private String name;
	public Map<String,Object> session;
	private String errorMessage;

	public String execute() throws SQLException{

		LoginCompleteDAO dao = new LoginCompleteDAO();
		LoginCompleteDTO dto = new LoginCompleteDTO();
		String result = ERROR;

		dto = dao.select(password, name);

		if(password.equals(dto.getPassword())) {
			if(name.equals(dto.getUserName())) {
				result = SUCCESS;
			}
		}else {
			setErrorMessage("ログインできません。");
		}

		session.put(name,dto.getUserName());
		return result;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



}
