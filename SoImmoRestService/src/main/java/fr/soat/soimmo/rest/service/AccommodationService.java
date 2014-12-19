package fr.soat.soimmo.rest.service;

import java.util.List;

import fr.soat.soimmo.rest.model.Accommodation;
import fr.soat.soimmo.rest.model.AccommodationDTO;
import fr.soat.soimmo.rest.model.SearchAccommodationParams;

public interface AccommodationService {
	
	// Full accommodations
	
	Accommodation findAccommodation(Long id);
	
	List<Accommodation> findAllAccommodations();
	
	List<Accommodation> findAllAccommodations(SearchAccommodationParams params);
	
	// Accommodation DTOs
	
	AccommodationDTO findAccommodationDTO(Long id);
	
	List<AccommodationDTO> findAllAccommodationDTOs();
	
	List<AccommodationDTO> findAllAccommodationDTOs(SearchAccommodationParams params);
	
}
