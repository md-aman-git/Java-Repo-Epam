package com.epam.day1;

public class PermanentEmployee extends Employee {

	
	@Override
	public void calculateSalary(Employee emp) {
		// TODO Auto-generated method stub
		int salary = emp.getHourRate() * emp.getWorkingHours();
		System.out.println("Salary for contract employee " + emp.getName() + " = " + salary);
	}

}
