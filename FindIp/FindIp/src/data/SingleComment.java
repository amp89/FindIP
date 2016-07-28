package data;

public class SingleComment {
	
	private String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public SingleComment(String comment) {
		super();
		this.comment = comment;
	}

	public SingleComment() {
		super();
	}

	@Override
	public String toString() {
		return "SingleComment [comment=" + comment + "]";
	}
	
	

}
