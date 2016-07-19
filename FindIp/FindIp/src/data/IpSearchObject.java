package data;

public class IpSearchObject {
	
	String ipAddress;
	String accessToken;

	
	
	
	@Override
	public String toString() {
		return "IpSearchObject [ipAddress=" + ipAddress + ", accessToken=" + accessToken + "]";
	}




	public IpSearchObject(String ipAddress, String accessToken) {
		super();
		this.ipAddress = ipAddress;
		this.accessToken = accessToken;
	}




	public String getIpAddress() {
		return ipAddress;
	}




	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}




	public String getAccessToken() {
		return accessToken;
	}




	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}




	public IpSearchObject() {
		super();
	}

	
	
	

}
