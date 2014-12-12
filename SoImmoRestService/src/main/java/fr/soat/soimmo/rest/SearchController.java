package fr.soat.soimmo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.soat.soimmo.rest.db.Accommodation;
import fr.soat.soimmo.rest.db.Accommodations;
import fr.soat.soimmo.rest.db.SearchAccommodationParams;

@RestController
public class SearchController {

    @RequestMapping("/searchAll")
    public List<Accommodation> searchAll() {
        return Accommodations.ACCOMMODATIONS.getAll();
    }

    @RequestMapping(value = "search", method = RequestMethod.GET)
	public List<Accommodation> search(Model model, @Valid @ModelAttribute("searchAccommodationParams") SearchAccommodationParams searchParams, BindingResult result) {
    	
    	System.out.println("City : " + searchParams.getCity());
    	
		// Handle validation errors (e.g. wrong date format, elevator=2, etc...)
		if(result.hasErrors())
			return new ArrayList<Accommodation>();
    	
    	return Accommodations.ACCOMMODATIONS.getAll();
    }
    
}