package fr.soat.soimmo.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY")
public class Country {

	@Id
	@GeneratedValue
	@Column(name = "COUNTRY_ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	public Country() {
	}

	public Country(Long id, String name) {
		super();
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
		return "Country [id=" + id + ", name=" + name + "]";
	}
	
}
