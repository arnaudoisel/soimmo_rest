package fr.soat.soimmo.rest.model;

import com.mysema.query.annotations.QueryProjection;

public class AddressDTO {

    private String street;
	
    private String zipCode;

    private String city;

    private String state;

    private String country;

    private Double latitude;

	private Double longitude;

	@QueryProjection
	public AddressDTO(String street, String zipCode, String city, String state,
			String country, Double latitude, Double longitude) {
		super();
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public String getState() {
		return state;
	}

	public String getStreet() {
		return street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public void setState(String state) {
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
		return "AddressDTO [street=" + street + ", zipCode=" + zipCode
				+ ", city=" + city + ", state=" + state + ", country="
				+ country + ", latitude=" + latitude + ", longitude="
				+ longitude + "]";
	}
}
