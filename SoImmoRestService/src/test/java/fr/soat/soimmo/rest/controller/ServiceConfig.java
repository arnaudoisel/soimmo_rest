package fr.soat.soimmo.rest.controller;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.soat.soimmo.rest.service.AccommodationService;

@Configuration
public class ServiceConfig {

	@Bean
	public SearchController searchController() {
		return new SearchController();
	}
	
	@Bean
	public AccommodationService accommodationService() {
		return Mockito.mock(AccommodationService.class);
	}
}