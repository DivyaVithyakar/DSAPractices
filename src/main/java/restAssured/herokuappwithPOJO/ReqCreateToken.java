package restAssured.herokuappwithPOJO;

public class ReqCreateToken {
	
	private String username;
	private String password;
	
	public ReqCreateToken(String username, String password) 
	{
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
