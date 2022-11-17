package com.epam.day1;

public abstract class Employee {
	private int hourRate;
	private final int workingHours = 8;
	private String name;
	public abstract void calculateSalary(Employee emp);
	
	public int getHourRate() {
		return hourRate;
	}
	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
