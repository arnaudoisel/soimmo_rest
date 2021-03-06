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

import fr.soat.soimmo.rest.model.AccommodationDTO;
import fr.soat.soimmo.rest.model.SearchAccommodationParams;
import fr.soat.soimmo.rest.service.AccommodationService;

@RestController
public class SearchController {

	@Autowired
	private AccommodationService accommodationService;
	
    @RequestMapping(value = "searchAll", method = RequestMethod.GET)
    public List<AccommodationDTO> searchAll() {
    	
    	System.out.println("Hello");
    	
    	List<AccommodationDTO> accommodations = accommodationService.findAllAccommodationDTOs();
    	
    	System.out.println(accommodations);
    	
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
    /*
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public Accommodation add() {
    	
    	Country fr = new Country(null, "France");
    	
    	City boulogne = new City(null, "Boulogne-Billancourt");
    	
    	Address addr1 = new Address(null, "40 boulevard Jean Jaurès", "92100", boulogne, null, fr, 48.8423342d, 2.2381375d);
    	
    	AccommodationType accTypeAppart = new AccommodationType(null, "APARTMENT");
    	
    	HotWaterProductionType hotWatBoiler = new HotWaterProductionType(null, "BOILER");
    	
    	HeatingType heatingGaz = new HeatingType(null, "GAZ");
    	
    	Accommodation acc = new Accommodation(
				null,
				addr1,
				93d, // surface
				4, // rooms
				2,	// floor
				false, //elevator, 
				2200d, // rent, 
				150d, // charge,
				new GregorianCalendar(2015,1,6).getTime(), // availableFrom		
				true, // active
				accTypeAppart, // type
				hotWatBoiler, // hotWaterProductionType
				heatingGaz); // heatingType
    	
    	accommodationService.addAccommodation(acc);
    	
        return null;
    }
    */
    
}