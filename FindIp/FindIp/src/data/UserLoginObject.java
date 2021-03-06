package data;

import javax.validation.constraints.Size;

public class UserLoginObject {
	

	
	@Size(min=1, max=45)
	private String email;
	
	@Size(min=1, max=200) //TODO update min password size
	private String password;
	
	private String accessToken;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	


	@Override
	public String toString() {
		return "UserLoginObject [email=" + email + ", password=" + password + ", accessToken=" + accessToken + "]";
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	
	

}
