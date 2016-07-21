package data;

public class DeleteSavePostObject {

	private int saveId;
	private int userId;
	private String accessToken;
	public int getSaveId() {
		return saveId;
	}
	public void setSaveId(int saveId) {
		this.saveId = saveId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public DeleteSavePostObject(int saveId, int userId, String accessToken) {
		super();
		this.saveId = saveId;
		this.userId = userId;
		this.accessToken = accessToken;
	}
	public DeleteSavePostObject() {
		super();
	}
	@Override
	public String toString() {
		return "DeleteSavePostObject [saveId=" + saveId + ", userId=" + userId + ", accessToken=" + accessToken + "]";
	}
	
	
	
}
