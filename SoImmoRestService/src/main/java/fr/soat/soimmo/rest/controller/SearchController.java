package fr.soat.soimmo.rest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.soat.soimmo.rest.model.Accommodation;
import fr.soat.soimmo.rest.model.AccommodationDTO;
import fr.soat.soimmo.rest.model.SearchAccommodationParams;
import fr.soat.soimmo.rest.service.AccommodationService;

@RestController
public class SearchController {

	@Autowired
	private AccommodationService accommodationService;
	
    @RequestMapping(value = "searchAll", method = RequestMethod.GET)
    public List<Accommodation> searchAll() {
    	
    	List<Accommodation> accommodations = accommodationService.findAllAccommodations();
    	
        return accommodations;
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
	public List<AccommodationDTO> search(Model model, @Valid @ModelAttribute("searchAccommodationParams") SearchAccommodationParams searchParams, BindingResult result) {

    	System.out.println(searchParams);

    	List<AccommodationDTO> accommodationDTOs = accommodationService.findAllAccommodationDTOs(searchParams);
    	
    	System.out.println("REST - Found report accommodations : " + accommodationDTOs);
    	
		// Handle validation errors (e.g. wrong date format, elevator=2, etc...)
		if(result.hasErrors())
			return new ArrayList<AccommodationDTO>();
    	
    	return accommodationDTOs;
    }
    
}