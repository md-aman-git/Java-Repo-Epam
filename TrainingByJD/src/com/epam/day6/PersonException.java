package com.epam.day6;

public class PersonException extends Exception {
	String message;

	public PersonException(String message) {
		super(message);
	}
}
