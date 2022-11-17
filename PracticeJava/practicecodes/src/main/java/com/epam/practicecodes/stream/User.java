package com.epam.practicecodes.stream;

import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate dob;
	
	public User() {
	}

	public User(String name, int age, LocalDate dob) {
		this.name = name;
		this.age = age;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
}
