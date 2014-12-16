package fr.soat.soimmo.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HOT_WATER_PRODUCTION_TYPE")
public class HotWaterProductionType {

	@Id
	@GeneratedValue
	@Column(name = "HOT_WATER_PRODUCTION_TYPE_ID")
	private Long id;
	
	@Column(name = "NAME")
	private String name;

	public HotWaterProductionType() {
	}
	
	public HotWaterProductionType(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}