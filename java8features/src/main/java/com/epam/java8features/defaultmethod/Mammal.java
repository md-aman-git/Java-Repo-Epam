package com.epam.java8features.defaultmethod;

public interface Mammal {
	default void walk() {
		System.out.println("Mammal Walking...");
	}
	static void run() {
		System.out.println("Mammal Running...");
	}
}
