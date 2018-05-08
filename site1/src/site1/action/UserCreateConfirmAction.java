package site1.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	private String id;
	private String password;
	private String name;
	public Map<String,Object> session;
	private String errorMessage;

	public String execute() {

		String result = SUCCESS;

		if(!(id.equals("")) && !(password.equals("")) && !(name.equals(""))){
			session.put("id",id);
			session.put("password",password);
			session.put("name",name);
		}else {
			setErrorMessage("未入力項目があります。");
			result = ERROR;
		}
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

	public Map<String,Object> session(){
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
