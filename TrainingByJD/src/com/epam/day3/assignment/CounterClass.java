package com.epam.day3.assignment;

public class CounterClass {
	static int count = 0;
	CounterClass() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}
