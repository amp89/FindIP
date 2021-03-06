package unitTesting;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Save;
import entities.User;
import entities.UserType;

public class UserTest {

	private static String PERSISTENCE_UNIT_NAME = "ipdb";
	private static int USER_ID = 1;
	private static int ADDRESS_ID = 5202138;
	private static int SAVE_ID = 1;

	private EntityManagerFactory emf;
	private EntityManager em;
	private User user;

	@Before
	public void setUp() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
		user = em.find(User.class, USER_ID);
	}

	@After
	public void cleanUp(){
		em.close();
		emf.close();
	}
/*
mysql> select * from users;
+----+--------------------+----------+-----------------+---------------+--------------+
| id | email              | password | confirmation_id | failed_logins | user_type_id |
+----+--------------------+----------+-----------------+---------------+--------------+
|  1 | fake@fakemail.com  | password | uw4$^WIsjrea6   |             0 |            1 |
+----+--------------------+----------+-----------------+---------------+--------------+


 */
	
	@Test
	public void id() {
		assertEquals(USER_ID,user.getId());
				
	}
	
	@Test
	public void email() {
		assertEquals("fake@fakemail.com",user.getEmail());
		
	}
	
	
	
	@Test
	public void password() {
		assertEquals("password",user.getPassword());
		
	}
	
	
	@Test
	public void confirmationId() {
		assertEquals("uw4$^WIsjrea6",user.getConfirmation_id());
		
	}
	
	
	@Test
	public void failedLogins() {
		assertEquals(0,user.getFailedLogins());
		
	}
	
	
	@Test
	public void userType() {
		UserType ut = em.find(UserType.class, user.getId());
		assertEquals(ut,user.getUserType());
		assertEquals(ut.getAccessLevel(),user.getUserType().getAccessLevel());
		assertEquals(ut.getName(),user.getUserType().getName());
		assertEquals(ut.getId(),user.getUserType().getId());
		
	}
	
	@Test
	public void userSaves(){
		Save s = em.find(Save.class, user.getSaves().get(0).getId());
		assertEquals(s,user.getSaves().get(0));
		assertEquals(s.getId(),user.getSaves().get(0).getId());
		assertEquals(s.getAddress(),user.getSaves().get(0).getAddress());
		assertEquals(s.getPrivateComment(),user.getSaves().get(0).getPrivateComment());
		assertEquals(s.getPublicComment(), user.getSaves().get(0).getPublicComment());
		assertEquals(s.getUser().getId(), user.getId());
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
