package com.epam.java8features.constructorreference;

public class Addition {
	int a, b;
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int getValue() {
		return this.a + this.b;
	}
}
