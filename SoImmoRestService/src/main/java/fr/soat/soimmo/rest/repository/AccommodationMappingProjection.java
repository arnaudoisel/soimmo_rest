package fr.soat.soimmo.rest.repository;

import static fr.soat.soimmo.rest.model.QAccommodation.accommodation;

import com.mysema.query.Tuple;
import com.mysema.query.types.MappingProjection;

import fr.soat.soimmo.rest.model.AccommodationDTO;
import fr.soat.soimmo.rest.model.Address;
import fr.soat.soimmo.rest.model.AddressDTO;

public class AccommodationMappingProjection extends MappingProjection<AccommodationDTO>{

	private static final long serialVersionUID = 7032298494107307615L;

	public AccommodationMappingProjection() {
		super(AccommodationDTO.class,
				accommodation.id,
				accommodation.address,
				accommodation.surface,
				accommodation.rooms,
				accommodation.elevator,
				accommodation.rent,
				accommodation.charge,
				accommodation.availableFrom,
				accommodation.active,
				accommodation.type.name,
				accommodation.hotWaterProductionType.name,
				accommodation.heatingType.name);
	}

	@Override
	protected AccommodationDTO map(Tuple row) {
		
		Address address = row.get(accommodation.address);
		return new AccommodationDTO(
				row.get(accommodation.id), 
				new AddressDTO(
						address.getStreet(),
						address.getZipCode(),
						address.getCity() == null ? null : address.getCity().getName(),
						address.getState() == null ? null : address.getState().getName(),
						address.getCountry() == null ? null : address.getCountry().getName(),
						address.getLatitude(),
						address.getLongitude()),
				row.get(accommodation.surface),
				row.get(accommodation.rooms),
				row.get(accommodation.elevator),
				row.get(accommodation.rent),
				row.get(accommodation.charge),
				row.get(accommodation.availableFrom),
				row.get(accommodation.active),
				row.get(accommodation.type.name),
				row.get(accommodation.hotWaterProductionType.name),
				row.get(accommodation.heatingType.name));
	}
	
}