package com.epam.designpattern.mvc;

public class StudentModel {
	private int rollNumber;
	private String name;
	public StudentModel(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	public StudentModel() {
		// TODO Auto-generated constructor stub
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
