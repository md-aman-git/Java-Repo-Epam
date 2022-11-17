package com.epam.designpattern.factory;

public class EmployeeFactory {
	Employee getEmployee(int role, String name) {
		if(role == 1) {
			return new Manager(name);
		}
		else if(role == 2){
			return new SoftwareEngineer(name);
		}
		return null;
	}
}
