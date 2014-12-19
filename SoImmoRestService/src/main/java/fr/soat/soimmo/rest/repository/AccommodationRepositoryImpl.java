package fr.soat.soimmo.rest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.Predicate;

import fr.soat.soimmo.rest.model.AccommodationDTO;
import fr.soat.soimmo.rest.model.QAccommodation;

@Repository
public class AccommodationRepositoryImpl implements AccommodationRepositoryCustom {

	private static final QAccommodation a = QAccommodation.accommodation;    

	@PersistenceContext
	private EntityManager entityManager;

//	private QAccommodationDTO newProjection() {
//		return new QAccommodationDTO(
//				a.id,
//				new QAddressDTO(
//						a.address.street,
//						a.address.zipCode,
//						a.address.city.name,
//						a.address.state.name, 
//						a.address.country.name,
//						a.address.latitude, 
//						a.address.longitude),
//				a.surface,
//				a.rooms,
//				a.elevator,
//				a.rent, 
//				a.charge,
//				a.availableFrom,
//				a.active,
//				a.type.name,
//				a.hotWaterProductionType.name,
//				a.heatingType.name);
//	}
//	
	@Override
	public AccommodationDTO findOneDTO(Long id) {
		
		JPAQuery query = new JPAQuery(entityManager);
		
		AccommodationDTO dto = query.from(a).where(a.id.eq(id))
				  .uniqueResult(new AccommodationMappingProjection());

		return dto;
	}
	
	@Override
	public List<AccommodationDTO> findAllDTOs() {
		
		JPAQuery query = new JPAQuery(entityManager);
		
		List<AccommodationDTO> dtos = query.from(a).list(new AccommodationMappingProjection());

		return dtos;
	}

	@Override
	public List<AccommodationDTO> findAllDTOs(Predicate predicate) {
		
		JPAQuery query = new JPAQuery(entityManager);
		
		List<AccommodationDTO> dtos = query.from(a).where(predicate).list(new AccommodationMappingProjection());

		return dtos;
	}

}
