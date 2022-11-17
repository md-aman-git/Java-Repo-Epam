package com.epam.day3.assignment;

public class Employee implements CompanyManagement {
	String name;
	Employee(String name) {
		this.name = name;
	}
	@Override
	public void printPaySlip(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Printing pay slip for " + emp.getName());
	}

	@Override
	public void takeAttendance(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Taking attendance for " + emp.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
