package com.audriuskumpis;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private HashMap<String, String> countryOptions;

	public Student() {
		// populate data
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("DE", "Germany");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");
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
