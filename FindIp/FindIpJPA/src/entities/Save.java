package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="saves")
public class Save {

	@Id
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
	
	
}
