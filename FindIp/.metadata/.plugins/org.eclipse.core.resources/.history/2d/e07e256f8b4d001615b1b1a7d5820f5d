package dataLoading;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Address;
import entities.Save;
import entities.User;

public class SaveLoad {
	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private static String PERSISTENCE_UNIT_NAME = "ipdb";
	private static int USER_ID_TO_SAVE = 1;
	private static int IP_ID_TO_SAVE = 5202138;

	public static void main(String[] args) {

		SaveLoad loader = new SaveLoad();
		loader.setupEntityManager();
		loader.createSave();
		loader.closeEntityManager();

	}

	private void createSave() {
		em.getTransaction().begin();
		
		User user = em.find(User.class, USER_ID_TO_SAVE );
		Address address = em.find(Address.class, IP_ID_TO_SAVE);
		String publicComment = "THIS IS A PUBLIC COMMENT!!!!!";
		String privateComment = "THIS IS A PRIVATE COMMENT!";
		
		Save newSave = new Save(publicComment, privateComment, user, address);
		em.persist(newSave);		
		em.getTransaction().commit();
		System.out.println("SAVE PERSIST COMPLETE.");
		

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
