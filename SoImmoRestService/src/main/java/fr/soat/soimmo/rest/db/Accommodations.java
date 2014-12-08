package fr.soat.soimmo.rest.db;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Accommodations {
	
	public final static Accommodations ACCOMMODATIONS = new Accommodations();
	
	static {
		
	    final AtomicLong counter = new AtomicLong();

		ACCOMMODATIONS.add(new Accommodation(
				counter.incrementAndGet(),
				new Address("37 boulevard Jean Jaurès", "92100", "Boulogne-Billancourt", "", "France", 48.8423342d, 2.2381375d),
				93d, // surface
				4, // rooms
				false, //elevator, 
				2200d, // rent, 
				150d, // charge,
				new GregorianCalendar(2015,1,6).getTime(), // availableFrom		
				true, // active
				AccommodationType.APARTMENT, // type
				HotWaterProductionType.BOILER, // hotWaterProductionType
				HeatingType.GAZ)); // heatingType
		ACCOMMODATIONS.add(new Accommodation(
				counter.incrementAndGet(),
				new Address("30 avenue des Champs Elysées", "75008", "Paris", "", "France", 48.8700168d, 2.3085181),
				150d, //				surface,
				5, //				rooms, 
				true, //				elevator, 
				3833d, //				rent, 
				250d, //				charge,
				new GregorianCalendar(2015,0,4).getTime(), //				availableFrom,
				true, //				active,
				AccommodationType.APARTMENT, // type
				HotWaterProductionType.BOILER, // hotWaterProductionType
				HeatingType.GAZ)); // heatingType
		ACCOMMODATIONS.add(new Accommodation(
				counter.incrementAndGet(),
				new Address("3 Rue de la Fraternité", "94300", "Vincennes", "", "France", 48.8489081d, 2.4323437d),
				37d, //				surface,
				2, //				rooms, 
				false, //				elevator, 
				1024d,//				rent, 
				100d, //				charge,
				new GregorianCalendar(2015,2,15).getTime(), //				availableFrom,
				true, //				active,
				AccommodationType.APARTMENT, // type
				HotWaterProductionType.BALLOON, // hotWaterProductionType
				HeatingType.ELECTRIC)); // heatingType
	}
	
	private List<Accommodation> accommodations = new ArrayList<Accommodation>();
	
	public List<Accommodation> getAll() {
		return new ArrayList<Accommodation>(accommodations);
	}
	
	/**
	 * 
	 * @param index
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
	 * @return
	 */
	public Accommodation get(int index) {
		return accommodations.get(index);
	}
	
	public void add(Accommodation accommodation) {
		this.accommodations.add(accommodation);
	}
	
	public void addAll(List<Accommodation> collection) {
		this.accommodations.addAll(collection);
	}
	
}
