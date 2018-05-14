package login2.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import login2.dao.LoginDAO;
import login2.dto.LoginDTO;

public class LoginAction extends ActionSupport implements SessionAware{

	private String name;
	private String password;
	public Map<String,Object>session;
	private String errorMessage;

	public String execute() throws SQLException{

		String result = ERROR;

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

		dto = dao.select(name,password);

		if(name.equals(dto.getName())) {
			if(password.equals(dto.getPassword())) {
				result = SUCCESS;
			}
		}else {
			setErrorMessage("ログインできません");
		}

		session.put("name",dto.getName());
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String,Object>getSession(){
		return session;
	}

	public void setSession(Map<String,Object>session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


}