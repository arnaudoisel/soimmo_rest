package fr.soat.soimmo.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOMMODATION_TYPE")
public class AccommodationType {

	@Id
	@GeneratedValue
	@Column(name = "ACCOMMODATION_TYPE_ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	public AccommodationType() {
		
	}
	
	public AccommodationType(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "AccommodationType [id=" + id + ", name=" + name + "]";
	}
	
	
}
