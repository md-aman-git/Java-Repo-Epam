package com.epam.java8features.defaultmethod;

public interface Animal {
	default void walk() {
		System.out.println("Animal Walking...");
	}
	static void run() {
		System.out.println("Animal Running...");
	}
}
