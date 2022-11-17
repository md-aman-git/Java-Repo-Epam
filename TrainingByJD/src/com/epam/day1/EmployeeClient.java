package com.epam.day1;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new ContractorEmployee();
		employee.setHourRate(20);
		employee.setName("Whatever");
		employee.calculateSalary(employee);
		
		Employee employee2 = new PermanentEmployee();
		employee2.setHourRate(40);
		employee2.setName("Aman");
		employee2.calculateSalary(employee2);
	}

}
