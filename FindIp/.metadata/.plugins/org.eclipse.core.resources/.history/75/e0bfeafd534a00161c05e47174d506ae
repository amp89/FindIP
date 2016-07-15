package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_type")
public class UserType {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="access_level")
	private int accessLevel;
	
	@OneToMany(mappedBy = "userType")
	List<User> users;
	
	
	
	

}
