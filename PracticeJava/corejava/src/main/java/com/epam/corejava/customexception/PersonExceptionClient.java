package com.epam.corejava.customexception;

public class PersonExceptionClient {

	public static void main(String[] args) throws PersonException {
		// TODO Auto-generated method stub
		int age = 20;
		if(age >= 18) {
			System.out.println("Person eligible to vote.");
		}
		else {
			throw new PersonException("Person not eligible to vote.");
		}
	}

}
