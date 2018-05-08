package site1.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import site1.dao.UserCreateCompleteDAO;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String id;
	private String password;
	private String name;
	public Map<String,Object> session;
	UserCreateCompleteDAO dao = new UserCreateCompleteDAO();

	public String execute() throws SQLException {

		dao.user_info(
				session.get("id").toString(),
				session.get("password").toString(),
				session.get("name").toString());
		String result = SUCCESS;
		return result;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

}
