package com.epam.day3.assignment;

public class GenericsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For administrator
		GenericCompany<Employee> employee = new GenericCompany<>();
		
		Admin admin = new Admin("Admin");
		employee.set(admin);
		employee.get().printPaySlip(admin);
		employee.get().takeAttendance(admin);
		//For developer
		Developer developer = new Developer("Developer");
		employee.set(developer);
		employee.get().printPaySlip(developer);
		employee.get().takeAttendance(developer);
		
		//For HR
		HR hr = new HR("HR");
		employee.set(hr);
		employee.get().printPaySlip(hr);
		employee.get().takeAttendance(hr);
	}

}
