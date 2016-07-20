package data;

import entities.Address;
import entities.Save;
import entities.User;

public class IpSaveObject extends Save {

	private String accessToken;
	
	public IpSaveObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IpSaveObject(String publicComment, String privateComment, User user, Address address, String accessToken) {
		super(publicComment, privateComment, user, address);
		this.accessToken = accessToken;
		// TODO Auto-generated constructor stub
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	
	

}
