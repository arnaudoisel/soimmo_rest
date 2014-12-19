package fr.soat.soimmo.rest.service;

import static fr.soat.soimmo.rest.repository.AccommodationCriteria.*;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysema.query.BooleanBuilder;
import com.mysema.query.types.Predicate;

import fr.soat.soimmo.rest.model.Accommodation;
import fr.soat.soimmo.rest.model.AccommodationDTO;
import fr.soat.soimmo.rest.model.SearchAccommodationParams;
import fr.soat.soimmo.rest.repository.AccommodationRepository;
import fr.soat.soimmo.rest.utils.Utils;

@Service("accommodationService")
public class AccommodationServiceImpl implements AccommodationService {

	@Autowired
	private AccommodationRepository accommodationRepository;

	private Predicate buildPredicate(SearchAccommodationParams params) {
		
		// Params
		String type = params.getType();
		String city = params.getCity();
		Integer minSurface = params.getMinSurface();
		Integer minRooms = params.getMinRooms();
		Integer floor = params.getFloor();
		Boolean elevator = params.getElevator();
		Double maxRentCharge = params.getMaxRentCharge();
		Date maxAvailabilityDate = params.getMaxAvailabilityDate();

		// Query		
		BooleanBuilder builder = new BooleanBuilder();

		if (!Utils.isEmpty(type))
			builder.and(
					isOfType(type));
		if (!Utils.isEmpty(city))
			builder.and(
					isInCity(city));
		if (minSurface != null)
			builder.and(
					hasSurfaceLargerThan(minSurface));
		if (minRooms != null)
			builder.and(
					hasMoreRoomsThan(minRooms));
		if (floor != null)
			builder.and(
					isAtFloor(floor));
		if (elevator != null)
			builder.and(
					hasElevator(elevator));
		if (maxRentCharge != null)
			builder.and(
					hasRentAndChargeLowerThan(maxRentCharge));
		if (maxAvailabilityDate != null)
			builder.and(
					isAvailableBefore(maxAvailabilityDate));
		
		return builder.getValue();
	}

	@Override
	public Accommodation findAccommodation(Long id) {
		return accommodationRepository.findOne(id);
	}

	@Override
	public AccommodationDTO findAccommodationDTO(Long id) {
		return accommodationRepository.findOneDTO(id);
	}

	@Override
	public List<AccommodationDTO> findAllAccommodationDTOs() {
		return Utils.toList(accommodationRepository.findAllDTOs());
	}

	@Override
	public List<AccommodationDTO> findAllAccommodationDTOs(SearchAccommodationParams params) {
		return Utils.toList(accommodationRepository.findAllDTOs(buildPredicate(params)));
	}

	@Override
	public List<Accommodation> findAllAccommodations() {
		return accommodationRepository.findAll();
	}

	@Override
	public List<Accommodation> findAllAccommodations(SearchAccommodationParams params) {
		return Utils.toList(accommodationRepository.findAll(buildPredicate(params)));
	}

}
