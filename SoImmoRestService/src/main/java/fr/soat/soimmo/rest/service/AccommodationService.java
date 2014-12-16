package fr.soat.soimmo.rest.service;

import java.util.List;

import fr.soat.soimmo.rest.model.Accommodation;

public interface AccommodationService {
	
	Accommodation findAccommodation(Long id);
	
	List<Accommodation> findAllAccommodations();
	
}
