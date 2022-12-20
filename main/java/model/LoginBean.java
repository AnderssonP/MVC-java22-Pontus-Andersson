package model;

public class LoginBean {
    
	private String User = "";
    private String password = "";

	
	public String getUser() {
		return User;
	}


	public void setUser(String user) {
		User = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAccount() {
		return accountHandler.getAccount(User, password);
	}
}
