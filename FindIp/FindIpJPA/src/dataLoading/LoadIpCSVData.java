package dataLoading;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.annotations.SelectBeforeUpdate;

public class LoadIpCSVData {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private static String PERSISTENCE_UNIT_NAME = "ipdb";
	public static void main(String[] args) {
		//make new
		LoadIpCSVData loader = new LoadIpCSVData();
		
		//setup entity mananger
		loader.setupEntityManager();
		//read and persist
		loader.readAndPersist();
		//close entity mananger
		loader.closeEntityManager();
		
	}
	
	private void readAndPersist(){
		System.out.println("READING");
	}
	
	private void setupEntityManager(){
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
	}
	
	private void closeEntityManager(){
		em.close();
		emf.close();
	}
	
	
}
