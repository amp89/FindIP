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
		em.getTransaction().begin();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(FILEPATH));
			String line = "";
			int counter = 0;//TODO COUNTER TO STOP FOR TESTING.  REMOVE THIS.
			//TODO PUT THIS LINE BACK			while ((line = br.readLine()) != null) {
				while (((line = br.readLine()) != null) && counter++ < 50 ) { //TODO REMOVE THIS LINE
				
				String[] lineTokens = line.trim().split("\",\"");
				int startIp = Integer.parseInt(lineTokens[0].replace("\"", "").trim());
				int endIp = Integer.parseInt(lineTokens[1].replace("\"", "").trim());
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
				System.out.println(newAddress); // TODO remove test print out.
				em.persist(newAddress);

			}

		} catch (IOException ioe) {
			System.err.println(ioe);
		} finally {
			try {
				br.close();
			} catch (IOException ioe2) {
				System.err.println(ioe2);
			}
		} // end finally
		
		em.getTransaction().commit();

	}

	// persist an object to the persistence unit
	//TODO REMOVE TIS
	private void persistLine(Object objectToPersist) {
		em.getTransaction().begin();
		em.persist(objectToPersist);
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