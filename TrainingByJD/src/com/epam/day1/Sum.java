package com.epam.day1;

public class Sum {
	//constructor chaining.
	int x, y;
	public Sum() {
		this(2, 3);
		System.out.println("Constructor 1");
	}
	public Sum(int x) {
		this();
		System.out.println("Constructor 2");
	}
	public Sum(int x, int y) {
		System.out.println("Constructor 3");
	}
}
