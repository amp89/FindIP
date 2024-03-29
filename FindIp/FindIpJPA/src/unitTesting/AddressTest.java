package unitTesting;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entities.Address;
import entities.Save;

public class AddressTest {

	private static String PERSISTENCE_UNIT_NAME = "ipdb";
	private static int USER_ID = 1;
	private static int ADDRESS_ID = 5202138;
	private static int SAVE_ID = 1;

	private EntityManagerFactory emf;
	private EntityManager em;
	private Address address;

	@Before
	public void setUp() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
		address = em.find(Address.class, ADDRESS_ID);
	}

	@After
	public void cleanUp(){
		em.close();
		emf.close();
	}
/*
 * mysql> select * from addresses where id = 5202138;
+---------+-----------+-----------+----------------------+--------------+--------+--------+----------+-----------+-------------+
| id      | start_ip  | end_ip    | country_abbreviation | country_name | region | city   | latitude | longitude | postal_code |
+---------+-----------+-----------+----------------------+--------------+--------+--------+----------+-----------+-------------+
| 5202138 | 979174656 | 979174911 | JP                   | Japan        | Miyagi | Sendai |   38.267 |   140.867 | 980-0802    |
+---------+-----------+-----------+----------------------+--------------+--------+--------+----------+-----------+-------------+
1 row in set (0.00 sec)

 */
	
	@Test
	public void id() {
		assertEquals(ADDRESS_ID,address.getId());
		
	}

	
	@Test
	public void endIp() {
		assertEquals(979174911,address.getEndIp());
	}
	
	
	@Test
	public void startIp() {
		assertEquals(979174656,address.getStartIp());
		
	}
	
	
	@Test
	public void abbreviation() {
		assertEquals("JP",address.getCountryAbbreviation());
		
		
	}
	
	
	@Test
	public void countryName() {
		assertEquals("Japan",address.getCountryName());
		
		
	}
	
	@Test
	public void region() {
		assertEquals("Miyagi",address.getRegion());
		
		
	}
	
	@Test
	public void city() {
		assertEquals("Sendai",address.getCity());
		
		
	}
	
	@Test
	public void lat() {
		assertEquals(Double.valueOf(38.267),Double.valueOf(address.getLatitude()));
		
		
	}
	@Test
	public void lon() {
		assertEquals(Double.valueOf(140.867),Double.valueOf(address.getLongitude()));
		
		
	}
	@Test
	public void postalCode() {
		assertEquals("980-0802",address.getPostalCode());

	}
	@Test
	public void saves(){
		Save s = em.find(Save.class, address.getSaves().get(0).getId());
		assertEquals(s,address.getSaves().get(0));
		assertEquals(s.getId(),address.getSaves().get(0).getId());
		assertEquals(s.getAddress(),address.getSaves().get(0).getAddress());
		assertEquals(s.getPrivateComment(),address.getSaves().get(0).getPrivateComment());
		assertEquals(s.getPublicComment(), address.getSaves().get(0).getPublicComment());
		assertEquals(s.getUser().getId(), address.getSaves().get(0).getUser().getId());
	}
	
	
}
