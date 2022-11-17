package com.epam.day6;

public class CustomExceptionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Rahul", 20);
		Person person2 = new Person("Ilyas", 17);
		
		try {
			vaccination(person1);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			vaccination(person2);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	static void vaccination(Person person) throws PersonException {
		if(person.getAge() < 18) {
			throw new PersonException("Invalid age less than 18");
		}
		else {
			System.out.println(person.getName() + " Vaccinated successfully.");
		}
	}
}
