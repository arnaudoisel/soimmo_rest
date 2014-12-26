package fr.soat.soimmo.rest.controller;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import fr.soat.soimmo.rest.model.SearchAccommodationParams;
import fr.soat.soimmo.rest.service.AccommodationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class,
classes={ServiceConfig.class})
public class SearchControllerUnitTest {

	@Autowired
	private SearchController sut;

	@Autowired
	private AccommodationService service;
	
	@Test
	public void shouldFindAllAccommodationDTOsWhenSearchAllMethodIsCalled() {
	
		// Init

		// Action
		sut.searchAll();

		// Verification
		Mockito.verify(service, Mockito.times(1)).findAllAccommodationDTOs();
	}
	
	@Test
	public void shouldFindAllAccommodationDTOsBasedOnParamsWhenSearchMethodIsCalled() {
	
		// Init
		SearchAccommodationParams params = Mockito.mock(SearchAccommodationParams.class);
		
		// Action
		sut.search(mock(Model.class), params, mock(BindingResult.class));

		// Verification
		Mockito.verify(service, Mockito.times(1)).findAllAccommodationDTOs(eq(params));
	}
}
