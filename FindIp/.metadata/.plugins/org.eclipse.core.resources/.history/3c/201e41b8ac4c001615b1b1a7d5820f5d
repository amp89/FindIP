package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="saves")
public class Save {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="public_comment")
	private String publicComment;
	
	@Column(name="private_comment")
	private String privateComment;
	
	@ManyToOne
	@JoinColumn(name="users_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="addresses_id")
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Save(String publicComment, String privateComment, User user, Address address) {
		super();
		this.publicComment = publicComment;
		this.privateComment = privateComment;
		this.user = user;
		this.address = address;
	}

	public Save() {
		super();
	}
	
	
	
	
	
}
