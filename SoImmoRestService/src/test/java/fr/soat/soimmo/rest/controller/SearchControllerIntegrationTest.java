package fr.soat.soimmo.rest.controller;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.GregorianCalendar;

import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jayway.restassured.RestAssured;

import fr.soat.soimmo.rest.Application;
import fr.soat.soimmo.rest.model.Accommodation;
import fr.soat.soimmo.rest.model.AccommodationType;
import fr.soat.soimmo.rest.model.Address;
import fr.soat.soimmo.rest.model.City;
import fr.soat.soimmo.rest.model.Country;
import fr.soat.soimmo.rest.model.HeatingType;
import fr.soat.soimmo.rest.model.HotWaterProductionType;
import fr.soat.soimmo.rest.repository.AccommodationRepository;
/*
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest("server.port:0")*/
public class SearchControllerIntegrationTest {
/*
    @Autowired
    AccommodationRepository repository;

    Accommodation acc1;
    Accommodation acc2;
    Accommodation acc3;

    @Value("${local.server.port}")
    int port;*/
/*
    @Before
    public void setUp() {
    	
        repository.deleteAll();

    	Country fr = new Country(null, "France");
    	
    	City boulogne = new City(null, "Boulogne-Billancourt");
    	City paris = new City(null, "Paris");
    	City vincennes = new City(null, "Vincennes");
    	
    	Address addr1 = new Address(null, "38 boulevard Jean Jaurès", "92100", boulogne, null, fr, 48.8423342d, 2.2381375d);
    	Address addr2 = new Address(null, "31 avenue des Champs Elysées", "75008", paris, null, fr, 48.8700168d, 2.3085181);
    	Address addr3 = new Address(null, "4 Rue de la Fraternité", "94300", vincennes, null, fr, 48.8489081d, 2.4323437d);
    	
    	AccommodationType accTypeAppart = new AccommodationType(null, "APARTMENT");
    	
    	HotWaterProductionType hotWatBoiler = new HotWaterProductionType(null, "BOILER");
    	HotWaterProductionType hotWatBalloon = new HotWaterProductionType(null, "BALLOON");

    	HeatingType heatingGaz = new HeatingType(null, "GAZ");
    	HeatingType heatingElectric = new HeatingType(null, "ELECTRIC");

    	
    	acc1 = new Accommodation(
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
    	acc2 = new Accommodation(
    			null,
				addr2,
				150d, //				surface,
				5, //				rooms, 
				3,	// floor
				true, //				elevator, 
				3833d, //				rent, 
				250d, //				charge,
				new GregorianCalendar(2015,0,4).getTime(), //				availableFrom,
				true, //				active,
				accTypeAppart, // type
				hotWatBoiler, // hotWaterProductionType
				heatingGaz); // heatingType
    	acc3 = new Accommodation(
    			null,
    			addr3,
    			37d, //				surface,
				2, //				rooms, 
				1,	// floor
				false, //				elevator, 
				1024d,//				rent, 
				100d, //				charge,
				new GregorianCalendar(2015,2,15).getTime(), //				availableFrom,
				true, //				active,
				accTypeAppart, // type
				hotWatBalloon, // hotWaterProductionType
				heatingElectric); // heatingType
    	
        repository.save(Arrays.asList(acc1, acc2, acc3));
        
        RestAssured.port = port;
    }*/
/*
    @Test
    public void canFetchMickey() {
        Integer mickeyId = mickey.getId();

        when().
                get("/characters/{id}", mickeyId).
        then().
                statusCode(HttpStatus.SC_OK).
                body("name", Matchers.is("Mickey Mouse")).
                body("id", Matchers.is(mickeyId));
    }
*/
    /*
    @Test
    public void canFetchAll() {

        when().
                get("/searchAll").
        then().
                statusCode(HttpStatus.SC_OK).
                body(
                		"[0].address.zipCode", equalTo("92100"),
                		"[1].address.zipCode", equalTo("75008"),
                		"[2].address.zipCode", equalTo("94300"));
    }
*/
    /*
    @Test
    public void canDeletePluto() {
        Integer plutoId = pluto.getId();

        when()
                .delete("/characters/{id}", plutoId).
        then().
                statusCode(HttpStatus.SC_NO_CONTENT);
    }
    */
}