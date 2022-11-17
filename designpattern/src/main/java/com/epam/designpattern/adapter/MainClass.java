package com.epam.designpattern.adapter;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IEmployee emp = new SalaryCalculator();
		emp.setSalary(1000);
		float salary = emp.getSalary();
		System.out.println("Salary = " + salary);
	}

}
