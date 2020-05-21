package com.audriuskumpis;

import java.util.HashMap;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private HashMap<String, String> countryOptions;
	private List<String> operatingSystems;

	public Student() {
		// populate data
		countryOptions = new LinkedHashMap<>();
		operatingSystems = new ArrayList<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("DE", "Germany");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");
	}
	
	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	public List<String> getOperatingSystems(){
		return operatingSystems;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
}
