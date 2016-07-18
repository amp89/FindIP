package data;

import java.util.List;

import entities.Save;
import entities.UserType;


public class CurrentUser {

	private int id;

	private String email;

	private List<Save> saves;

	private UserType userType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Save> getSaves() {
		return saves;
	}

	public void setSaves(List<Save> saves) {
		this.saves = saves;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public CurrentUser(int id, String email, List<Save> saves, UserType userType) {
		super();
		this.id = id;
		this.email = email;
		this.saves = saves;
		this.userType = userType;
	}
	
	

	public CurrentUser() {
		super();
	}

	@Override
	public String toString() {
		return "CurrentUser [id=" + id + ", email=" + email + ", saves=" + saves + ", userType=" + userType.getName() + "]";
	}

	
	
	
}