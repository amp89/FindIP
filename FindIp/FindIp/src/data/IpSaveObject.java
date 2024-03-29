package data;

public class IpSaveObject{

	private String accessToken;
	private int userId;
	private int ipId;
	private String publicComment;
	private String privateComment;
	public IpSaveObject(String accessToken, int userId, int ipId, String publicComment, String privateComment) {
		super();
		this.accessToken = accessToken;
		this.userId = userId;
		this.ipId = ipId;
		this.publicComment = publicComment;
		this.privateComment = privateComment;
	}
	public IpSaveObject() {
		super();
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getIpId() {
		return ipId;
	}
	public void setIpId(int ipId) {
		this.ipId = ipId;
	}
	public String getPublicComment() {
		return publicComment;
	}
	public void setPublicComment(String publicComment) {
		this.publicComment = publicComment;
	}
	public String getPrivateComment() {
		return privateComment;
	}
	public void setPrivateComment(String privateComment) {
		this.privateComment = privateComment;
	}
	
	@Override
	public String toString() {
		return "IpSaveObject [accessToken=" + accessToken + ", userId=" + userId + ", ipId=" + ipId + ", publicComment="
				+ publicComment + ", privateComment=" + privateComment + "]";
	}
	
	
	
	

}
