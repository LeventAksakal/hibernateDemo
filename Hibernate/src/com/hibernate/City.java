package com.hibernate;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="city")
public class City implements Serializable{
	
	public City(String name, String countryCode, String district, int population) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}
	public City(){
		
	}
	
	@Id 
	@Column(name="ID")
	private int id;
	
	@Id 
	@Column(name="Name")
	private String name;
	
	@Id 
	@Column(name="CountryCode")
	private String countryCode;
	
	@Id 
	@Column(name="District")
	private String district;
	
	@Id 
	@Column(name="Population")
	private int population;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
}
