package data;

public class UserEditObject {

	private Integer id;
	private String email;
	private String password;
	private Integer accessLevel;
	private Integer failedLogins;
	
	
	public Integer getFailedLogins() {
		return failedLogins;
	}
	public void setFailedLogins(Integer failedLogins) {
		this.failedLogins = failedLogins;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public Integer getAccessLevel() {
		return accessLevel;
	}
	public void setAccessLevel(Integer accessLevel) {
		this.accessLevel = accessLevel;
	}
	public UserEditObject(Integer id, String email, String password, Integer accessLevel, Integer failedLogins) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.accessLevel = accessLevel;
		this.failedLogins = failedLogins;
	}
	public UserEditObject() {
		super();
	}
	@Override
	public String toString() {
		return "UserEditObject [id=" + id + ", email=" + email + ", password=" + password + ", accessLevel="
				+ accessLevel + ", failedLogins=" + failedLogins + "]";
	}

	

	
	
}
