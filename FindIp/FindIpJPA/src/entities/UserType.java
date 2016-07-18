package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="user_type")
public class UserType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="access_level")
	private int accessLevel;
	
	@JsonBackReference
	@OneToMany(mappedBy = "userType")
	List<User> users;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public UserType(String name, int accessLevel) {
		super();
		this.name = name;
		this.accessLevel = accessLevel;
	}

	public UserType() {
		super();
	}

	@Override
	public String toString() {
		return "UserType [id=" + id + ", name=" + name + ", accessLevel=" + accessLevel + ", users=" + users + "]";
	}
	
	
	
	
	
	
	

}
