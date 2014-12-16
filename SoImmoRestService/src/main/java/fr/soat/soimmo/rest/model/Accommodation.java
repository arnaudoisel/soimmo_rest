package fr.soat.soimmo.rest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOMMODATION")
public class Accommodation {

	@Id
	@GeneratedValue
	@Column(name = "ACCOMMODATION_ID")
	private long id;
	
	@OneToOne
	@JoinColumn(name="ADDRESS_ID")
    private Address address;

	@Column(name = "SURFACE")
    private Double surface;

	@Column(name = "ROOMS")
    private Integer rooms;

	@Column(name = "FLOOR")
	private Integer floor;
	
	@Column(name = "ELEVATOR")
    private Boolean elevator;

	@Column(name = "RENT")
	private Double rent;

	@Column(name = "CHARGE")
	private Double charge;

	@Column(name = "AVAILABILITY")
	private Date availableFrom;

	@Column(name = "ACTIVE")
    private Boolean active;

	@ManyToOne
	@JoinColumn(name="ACCOMMODATION_TYPE_ID", referencedColumnName="ACCOMMODATION_TYPE_ID")
    private AccommodationType type;

	@ManyToOne
	@JoinColumn(name="HOT_WATER_PRODUCTION_TYPE_ID", referencedColumnName="HOT_WATER_PRODUCTION_TYPE_ID")
    private HotWaterProductionType hotWaterProductionType;

	@ManyToOne
	@JoinColumn(name="HEATING_TYPE_ID", referencedColumnName="HEATING_TYPE_ID")
    private HeatingType heatingType;

	public Accommodation() {
	}
	
    public Accommodation(long id, Address address, Double surface,
			Integer rooms, Integer floor, Boolean elevator, Double rent,
			Double charge, Date availableFrom, Boolean active,
			AccommodationType type,
			HotWaterProductionType hotWaterProductionType,
			HeatingType heatingType) {
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

	public Address getAddress() {
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

    public HeatingType getHeatingType() {
        return heatingType;
    }

    public HotWaterProductionType getHotWaterProductionType() {
        return hotWaterProductionType;
    }

    public long getId() {
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

    public AccommodationType getType() {
        return type;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setAddress(Address address) {
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

    public void setHeatingType(HeatingType heatingType) {
        this.heatingType = heatingType;
    }

    public void setHotWaterProductionType(HotWaterProductionType hotWaterProductionType) {
        this.hotWaterProductionType = hotWaterProductionType;
    }

    public void setId(long id) {
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

    public void setType(AccommodationType type) {
        this.type = type;
    }
}
