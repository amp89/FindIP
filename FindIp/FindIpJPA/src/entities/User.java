package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="confirmation_id")
	private String confirmation_id;
	
	@Column(name="failed_logins")
	private int failedLogins;
	
	@OneToMany(mappedBy="user")
	private List<Save> saves;
	
	@ManyToOne
	@JoinColumn(name="user_type_id")
	private UserType userType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmation_id() {
		return confirmation_id;
	}

	public void setConfirmation_id(String confirmation_id) {
		this.confirmation_id = confirmation_id;
	}

	public int getFailedLogins() {
		return failedLogins;
	}

	public void setFailedLogins(int failedLogins) {
		this.failedLogins = failedLogins;
	}

	public List<Save> getSaves() {
		return saves;
	}

	public void setSaves(List<Save> saves) {
		this.saves = saves;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public User(String email, String password, String confirmation_id, int failedLogins, List<Save> saves,
			UserType userType) {
		super();
		this.email = email;
		this.password = password;
		this.confirmation_id = confirmation_id;
		this.failedLogins = failedLogins;
		this.saves = saves;
		this.userType = userType;
	}

	public User() {
		super();
	}
	
	
	
	

}