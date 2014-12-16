package fr.soat.soimmo.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.soat.soimmo.rest.model.Accommodation;

@Repository("accommodationRepository")
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
	
}
