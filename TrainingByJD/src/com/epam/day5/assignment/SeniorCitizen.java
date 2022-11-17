package com.epam.day5.assignment;

@Vaccinated(booster = "Y")
public class SeniorCitizen {
	private int aadhar;
	private String name;
	public SeniorCitizen(int aadhar, String name) {
		super();
		this.aadhar = aadhar;
		this.name = name;
	}
	public int getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
