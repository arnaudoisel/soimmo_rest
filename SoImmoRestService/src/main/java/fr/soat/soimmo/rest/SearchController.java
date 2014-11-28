package fr.soat.soimmo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.soat.soimmo.rest.db.Accommodation;
import fr.soat.soimmo.rest.db.Accommodations;

@RestController
public class SearchController {

    @RequestMapping("/searchAll")
    public List<Accommodation> searchAll() {
        return Accommodations.ACCOMMODATIONS.getAll();
    }
    
//    @RequestMapping("/search")
//    public List<Accommodation> search(@RequestParam(value="name", defaultValue="World") String name) {
//        return ;
//    }
    
}