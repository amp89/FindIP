package dataLoading;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.User;
import entities.UserType;

public class TestUserData {
	

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private static String PERSISTENCE_UNIT_NAME = "ipdb";

	public static void main(String[] args) {
	
		TestUserData loader = new TestUserData();
		loader.setupEntityManager();
		loader.loadUserData();
		loader.closeEntityManager();
		
	}
	
	private void loadUserData(){
		//em.find() 2 (will be admin) TODO
		em.getTransaction().begin();
		User newUser = new User("fake@fakemail.com","password","uw4$^WIsjrea6",0,em.createQuery("SELECT ut FROM UserType ut WHERE ut.accessLevel = :accessLevel",UserType.class).setParameter("accessLevel",1).getSingleResult());
		User newAdmin = new User("admin@fakemail.com","password","uw4$^WIsjrea6",0,em.createQuery("SELECT ut FROM UserType ut WHERE ut.accessLevel = :accessLevel",UserType.class).setParameter("accessLevel",2).getSingleResult());
		em.persist(newUser);
		em.persist(newAdmin);
		em.getTransaction().commit();
	}
	
	
	private void setupEntityManager() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
	}

	private void closeEntityManager() {
		em.close();
		emf.close();
	}
	
}
