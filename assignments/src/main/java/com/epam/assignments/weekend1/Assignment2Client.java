package com.epam.assignments.weekend1;

import java.util.Arrays;

public class Assignment2Client {

	public static void main(String[] args) {
		GenericAssignment2 generic = new GenericAssignment2();
		Object [] arr = {5, "Hello", 9, 2.0, 7};
		generic.add(arr);
		System.out.println("Before swap : " + Arrays.toString(arr));
		generic.exchangePosition(1, 4);
		System.out.println("After swap at index 1 and 4 : " + Arrays.toString(arr));
	}
}
