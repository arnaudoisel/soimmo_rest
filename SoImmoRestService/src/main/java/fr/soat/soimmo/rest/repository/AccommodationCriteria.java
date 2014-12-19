package fr.soat.soimmo.rest.repository;

import java.util.Date;

import com.mysema.query.types.Predicate;

import fr.soat.soimmo.rest.model.QAccommodation;

public class AccommodationCriteria {

	
	private static final QAccommodation a = QAccommodation.accommodation;

	public static Predicate isOfType(String type) {
		return a.type.name.eq(type);
	}
	
	public static Predicate isInCity(String city) {
		return a.address.city.name.eq(city);
	}
	
	public static Predicate hasSurfaceLargerThan(Integer minSurface) {
		return a.surface.gt(minSurface);
	}
	
	public static Predicate hasMoreRoomsThan(Integer minRooms) {
		return a.rooms.gt(minRooms);
	}
	
	public static Predicate isAtFloor(Integer floor) {
		return a.floor.eq(floor);
	}
	
	public static Predicate hasElevator(Boolean elevator) {
		return a.elevator.eq(elevator);
	}
	
	public static Predicate hasRentAndChargeLowerThan(Double maxRentCharge) {
		return a.rent.add(a.charge).lt(maxRentCharge);
	}
	
	public static Predicate isAvailableBefore(Date maxAvailabilityDate) {
		return a.availableFrom.before(maxAvailabilityDate);
	}
	
}
