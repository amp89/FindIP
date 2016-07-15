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
	
	

}
