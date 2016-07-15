package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="addresses")
public class Address {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="start_ip")
	private int startIp;
	
	@Column(name="end_ip")
	private int endIp;
	
	@Column(name="country_abbreviation")
	private String countryAbbreviation;
	
	@Column(name="country_name")
	private String countryName;
	
	@Column(name="region")
	private String region;
	
	@Column(name="city")
	private String city;
	
	@Column(name="latitude")
	private double latitude;
	
	@Column(name="longitude")
	private double longitude;
	
	@Column(name="postal_code")
	private String postalCode;
	
	@OneToMany(mappedBy="address")
	List<Save> saves;
	
	

}
