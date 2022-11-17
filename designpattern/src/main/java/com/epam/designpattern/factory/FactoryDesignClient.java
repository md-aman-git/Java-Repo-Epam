package com.epam.designpattern.factory;

public class FactoryDesignClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating software engineer using role id = 1;
		Employee emp = (new EmployeeFactory()).getEmployee(1, "Aman");
		System.out.println("Manager created : " + emp);
		
		//creating manager using role id = 2;
		Employee emp2 = (new EmployeeFactory()).getEmployee(2, "Dummy_Name");
		System.out.println("Software Engineer created : " + emp2);
	}

}
