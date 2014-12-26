package fr.soat.soimmo.rest.model;

import java.util.Date;

import com.mysema.query.annotations.QueryProjection;

public class AccommodationDTO {

	private Long id;
	
	private AddressDTO address;

    private Double surface;

    private Integer rooms;

    private Integer floor;
    
    private Boolean elevator;

	private Double rent;

	private Double charge;

    private Date availableFrom;

    private Boolean active;

    private String type;

	private String hotWaterProductionType;

	private String heatingType;

    @QueryProjection
	public AccommodationDTO(
			Long id,
			AddressDTO address,
			Double surface,
			Integer rooms,
			Integer floor,
			Boolean elevator,
			Double rent,
			Double charge,
			Date availableFrom,
			Boolean active,
			String type,
			String hotWaterProductionType,
			String heatingType) {
		super();
		this.id = id;
		this.address = address;
		this.surface = surface;
		this.rooms = rooms;
		this.floor = floor;
		this.elevator = elevator;
		this.rent = rent;
		this.charge = charge;
		this.availableFrom = availableFrom;
		this.active = active;
		this.type = type;
		this.hotWaterProductionType = hotWaterProductionType;
		this.heatingType = heatingType;
	}

    public Boolean getActive() {
		return active;
	}

	public AddressDTO getAddress() {
		return address;
	}
		
	public Date getAvailableFrom() {
		return availableFrom;
	}

	public Double getCharge() {
		return charge;
	}

	public Boolean getElevator() {
		return elevator;
	}

	public Integer getFloor() {
		return floor;
	}

	public String getHeatingType() {
		return heatingType;
	}

	public String getHotWaterProductionType() {
		return hotWaterProductionType;
	}

	public Long getId() {
		return id;
	}

	public Double getRent() {
		return rent;
	}

	public Integer getRooms() {
		return rooms;
	}

	public Double getSurface() {
		return surface;
	}

	public String getType() {
		return type;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public void setAvailableFrom(Date availableFrom) {
		this.availableFrom = availableFrom;
	}

	public void setCharge(Double charge) {
		this.charge = charge;
	}

	public void setElevator(Boolean elevator) {
		this.elevator = elevator;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public void setHeatingType(String heatingType) {
		this.heatingType = heatingType;
	}

	public void setHotWaterProductionType(
			String hotWaterProductionType) {
		this.hotWaterProductionType = hotWaterProductionType;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRent(Double rent) {
		this.rent = rent;
	}

	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}

	public void setSurface(Double surface) {
		this.surface = surface;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "AccommodationDTO [id=" + id + ", address=" + address
				+ ", surface=" + surface + ", rooms=" + rooms + ", floor="
				+ floor + ", elevator=" + elevator + ", rent=" + rent
				+ ", charge=" + charge + ", availableFrom=" + availableFrom
				+ ", active=" + active + ", type=" + type
				+ ", hotWaterProductionType=" + hotWaterProductionType
				+ ", heatingType=" + heatingType + "]";
	}


    
}