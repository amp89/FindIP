package entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="addresses")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="id")
	private int id;
	
	@Column(name="start_ip")
	private Long startIp;
	
	@Column(name="end_ip")
	private Long endIp;
	
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
	
	@JsonBackReference
	@OneToMany(mappedBy="address", fetch = FetchType.EAGER)
	List<Save> saves;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getStartIp() {
		return startIp;
	}

	public void setStartIp(long startIp) {
		this.startIp = startIp;
	}

	public long getEndIp() {
		return endIp;
	}

	public void setEndIp(long endIp) {
		this.endIp = endIp;
	}

	public String getCountryAbbreviation() {
		return countryAbbreviation;
	}

	public void setCountryAbbreviation(String countryAbbreviation) {
		this.countryAbbreviation = countryAbbreviation;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public List<Save> getSaves() {
		return saves;
	}

	public void setSaves(List<Save> saves) {
		this.saves = saves;
	}


	public Address(Long startIp, Long endIp, String countryAbbreviation, String countryName, String region,
			String city, double latitude, double longitude, String postalCode) {
		super();

		this.startIp = startIp;
		this.endIp = endIp;
		this.countryAbbreviation = countryAbbreviation;
		this.countryName = countryName;
		this.region = region;
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
		this.postalCode = postalCode;

	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", startIp=" + startIp + ", endIp=" + endIp + ", countryAbbreviation="
				+ countryAbbreviation + ", countryName=" + countryName + ", region=" + region + ", city=" + city
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", postalCode=" + postalCode + ", saves="
				+ saves + "]";
	}
	
	
	
	
	

}
