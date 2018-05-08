package create.action;

import java.sql.SQLException;
import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import create.dao.UserCreateCompleteDAO;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPass;
	private String userName;
	public Map<String,Object> session;

	private UserCreateCompleteDAO dao = new UserCreateCompleteDAO();

	public String execute() throws SQLException{

		dao.user_info(
			session.get("loginUserId").toString(),
			session.get("loginPass").toString(),
			session.get("userName").toString());

		String result = SUCCESS;
		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public void setSession(Map<String,Object>session) {
		this.session = session;
	}

}
