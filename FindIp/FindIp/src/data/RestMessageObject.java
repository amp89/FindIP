package data;

public class RestMessageObject {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public RestMessageObject(String message) {
		super();
		this.message = message;
	}

	public RestMessageObject() {
		super();
	}

	@Override
	public String toString() {
		return "RestMessageObject [message=" + message + "]";
	}
	
	
	
}
