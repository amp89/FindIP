package dataLoading;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.UserType;

public class UserTypeLoad {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private static String PERSISTENCE_UNIT_NAME = "ipdb";

	public static void main(String[] args) {

		UserTypeLoad loader = new UserTypeLoad();
		loader.setupEntityManager();
		loader.createUserTypes();
		loader.closeEntityManager();

	}

	private void createUserTypes() {
		List<UserType> userTypes = new ArrayList<>();
		em.getTransaction().begin();
		
		userTypes.add(new UserType("unauthorized_user",0));
		userTypes.add(new UserType("user",1));
		userTypes.add(new UserType("admin",2));
		for (UserType userType : userTypes) {
			System.out.println(userType);
			em.persist(userType);
			
		}
		
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
