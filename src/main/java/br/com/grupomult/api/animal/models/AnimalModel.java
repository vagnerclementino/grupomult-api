package br.com.grupomult.api.animal.models;

import br.com.grupomult.entities.enums.SpeciesEnum;

public class AnimalModel {
	
	private String name;
	private String dob;
	private Long ageInDays;
	private Long ageInMonths;
	private Long ageInYears;	
	private SpeciesEnum Species;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Long getAgeInDays() {
		return ageInDays;
	}
	public void setAgeInDays(Long ageInDays) {
		this.ageInDays = ageInDays;
	}
	public Long getAgeInMonths() {
		return ageInMonths;
	}
	public void setAgeInMonths(Long ageInMonths) {
		this.ageInMonths = ageInMonths;
	}
	public Long getAgeInYears() {
		return ageInYears;
	}
	public void setAgeInYears(Long ageInYears) {
		this.ageInYears = ageInYears;
	}
	public SpeciesEnum getSpecies() {
		return Species;
	}
	public void setSpecies(SpeciesEnum species) {
		Species = species;
	}

		
}
