package com.epam.java8features.defaultmethod;

public class Dog implements Animal, Mammal{

	public void walk() {
		Animal.super.walk();
		Mammal.super.walk();
	}
}
