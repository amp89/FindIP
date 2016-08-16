package dataLoading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Address;

public class LoadIpCSVData {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private static String PERSISTENCE_UNIT_NAME = "ipdb";
	private static String FILEPATH = "/Users/alex/Synced/IpLookUp/IP2LOCATION-LITE-DB11.csv";

	public static void main(String[] args) {
		// make new
		LoadIpCSVData loader = new LoadIpCSVData();

		// setup entity mananger
		loader.setupEntityManager();
		// read and persist
		loader.readAndPersist();
		// close entity mananger
		loader.closeEntityManager();

	}

	private void readAndPersist() {
		/*
		 * read each line, make a new Address, and and persist to db
		 */
		// start transaction
		BufferedReader br = null;
		try {
			em.getTransaction().begin();
			System.out.println(em.getTransaction().getRollbackOnly());
			System.out.println("Start Read");
			br = new BufferedReader(new FileReader(FILEPATH),2000000);
			String line = "";
			int counter = 1;//TODO COUNTER TO STOP FOR TESTING.  REMOVE THIS.
//			while ((line = br.readLine()) != null) { //TODO FULL DATA LINE
				while (((line = br.readLine()) != null) && counter < 3887985) { //TODO TEST LINE
				if(counter++%10000 == 0){
					System.out.println(counter);					
				}
				System.out.println("*****Current: " +  counter + " *****");
				String[] lineTokens = line.trim().split("\",\"");
				Long startIp = Long.parseLong(lineTokens[0].replace("\"", "").trim());
				Long endIp = Long.parseLong(lineTokens[1].replace("\"", "").trim());
				String countryAbbreviation = lineTokens[2].replace("\"", "").trim();
				String countryName = lineTokens[3].replace("\"", "").trim();
				String region = lineTokens[4].replace("\"", "").trim();
				String city = lineTokens[5].replace("\"", "").trim();
				double latitude = Double.parseDouble(lineTokens[6].replace("\"", "").trim());
				double longitude = Double.parseDouble(lineTokens[7].replace("\"", "").trim());
				String postalCode = lineTokens[8].replace("\"", "").trim();
				// make new addr
				Address newAddress = new Address(startIp, endIp, countryAbbreviation, countryName, region, city,
						latitude, longitude, postalCode);
				// persist addr
				System.out.println("***** TO COMMIT *****" + newAddress);
				em.persist(newAddress);
				

			}

		} catch (IOException ioe) {
			System.err.println(ioe);
			
		} catch (Exception e){
		  e.printStackTrace();	
		}finally {
		
			em.getTransaction().commit();
			try {
				System.out.println("LOAD HAS STOPPED");
				br.close();
				closeEntityManager();
			} catch (IOException ioe2) {
				System.err.println(ioe2);
			}
		} // end finally

	}

	// persist an object to the persistence unit

	private void setupEntityManager() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
	}

	private void closeEntityManager() {
		em.close();
		emf.close();
	}

}
