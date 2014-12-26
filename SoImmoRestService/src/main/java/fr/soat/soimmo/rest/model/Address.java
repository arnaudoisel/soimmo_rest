package fr.soat.soimmo.rest.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {

	@Id
	@GeneratedValue
	@Column(name = "ADDRESS_ID")
	private Long id;

	@Column(name = "STREET")
    private String street;
	
	@Column(name = "ZIP_CODE")
    private String zipCode;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="CITY_ID")
    private City city;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="STATE_ID")
    private State state;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="COUNTRY_ID")
    private Country country;

	@Column(name = "LATITUDE")
    private Double latitude;

	@Column(name = "LONGITUDE")
    private Double longitude;

	public Address() {
	}

	public Address(Long id, String street, String zipCode, City city, State state, Country country, Double latitude, Double longitude) {
    	this.id = id;
    	this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.latitude = latitude;
        this.longitude = longitude;
    }
	
	public City getCity() {
        return city;
    }

	public Country getCountry() {
        return country;
    }

    public Long getId() {
		return id;
	}

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public State getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setId(Long id) {
		this.id = id;
	}

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", zipCode="
				+ zipCode + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
}
