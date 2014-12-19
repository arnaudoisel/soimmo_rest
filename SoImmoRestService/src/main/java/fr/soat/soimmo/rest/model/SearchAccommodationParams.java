package fr.soat.soimmo.rest.model;

import java.util.Date;

import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;


public class SearchAccommodationParams {

    private String type;

	private String city;

    @Min(0)
    private Integer minSurface;

    @Min(0)
    private Integer minRooms;

    private Integer floor;

    private Boolean elevator;
    
    @Min(0)
    private Double maxRentCharge;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date maxAvailabilityDate;

    public SearchAccommodationParams() {
    	
    }
    
    public SearchAccommodationParams(String type, String city,
			Integer minSurface, Integer minRooms, Integer floor,
			Boolean elevator, Double maxRentCharge,
			Date maxAvailabilityDate) {
		this.type = type;
		this.city = city;
		this.minSurface = minSurface;
		this.minRooms = minRooms;
		this.floor = floor;
		this.elevator = elevator;
		this.maxRentCharge = maxRentCharge;
		this.maxAvailabilityDate = maxAvailabilityDate;
	}

	public String getCity() {
		return city;
	}

	public Boolean getElevator() {
		return elevator;
	}

	public Integer getFloor() {
		return floor;
	}

	public Date getMaxAvailabilityDate() {
		return maxAvailabilityDate;
	}

	public Double getMaxRentCharge() {
		return maxRentCharge;
	}

	public Integer getMinRooms() {
		return minRooms;
	}

	public Integer getMinSurface() {
		return minSurface;
	}

	public String getType() {
		return type;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setElevator(Boolean elevator) {
		this.elevator = elevator;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public void setMaxAvailabilityDate(Date maxAvailabilityDate) {
		this.maxAvailabilityDate = maxAvailabilityDate;
	}

	public void setMaxRentCharge(Double maxRentCharge) {
		this.maxRentCharge = maxRentCharge;
	}

	public void setMinRooms(Integer minRooms) {
		this.minRooms = minRooms;
	}

	public void setMinSurface(Integer minSurface) {
		this.minSurface = minSurface;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "SearchAccommodationParams [type=" + type + ", city=" + city
				+ ", minSurface=" + minSurface + ", minRooms=" + minRooms
				+ ", floor=" + floor + ", elevator=" + elevator
				+ ", maxRentCharge=" + maxRentCharge + ", maxAvailabilityDate="
				+ maxAvailabilityDate + "]";
	}

}
