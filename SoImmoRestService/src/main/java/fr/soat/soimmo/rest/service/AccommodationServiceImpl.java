package fr.soat.soimmo.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.soat.soimmo.rest.model.Accommodation;
import fr.soat.soimmo.rest.repository.AccommodationRepository;

@Service("accommodationService")
public class AccommodationServiceImpl implements AccommodationService {

	@Autowired
	private AccommodationRepository accommodationRepository;
	
	@Override
	public List<Accommodation> findAllAccommodations() {
		return accommodationRepository.findAll();
	}
	
	@Override
	public Accommodation findAccommodation(Long id) {
		return accommodationRepository.findOne(id);
	}
	
}
