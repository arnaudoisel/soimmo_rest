package fr.soat.soimmo.rest.repository;

import java.util.List;

import com.mysema.query.types.Predicate;

import fr.soat.soimmo.rest.model.AccommodationDTO;

public interface AccommodationRepositoryCustom {

	AccommodationDTO findOneDTO(Long id);

	List<AccommodationDTO> findAllDTOs();
	
	List<AccommodationDTO> findAllDTOs(Predicate predicate);
	
}
