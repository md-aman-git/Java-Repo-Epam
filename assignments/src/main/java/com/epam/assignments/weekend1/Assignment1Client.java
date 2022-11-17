package com.epam.assignments.weekend1;

import java.util.ArrayList;

public class Assignment1Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		arr.add("Hello");
		arr.add(17);
		arr.add("abba");
		arr.add("kpp");
		arr.add(8);
		arr.add(121);
		arr.add("jahaj");
		GenericAssignment1 generic = new GenericAssignment1();
		generic.add(arr);
		System.out.println("Count of odd = " + generic.getCountOdd());
		System.out.println("Count of prime = " + generic.getCountPrime());
		System.out.println("Count of palindrome = " + generic.getCountPalindrome());
	}

}
