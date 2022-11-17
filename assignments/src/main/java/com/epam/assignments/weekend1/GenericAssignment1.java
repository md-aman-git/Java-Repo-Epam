package com.epam.assignments.weekend1;

import java.util.ArrayList;

public class GenericAssignment1<P> {
	private ArrayList<P> p;
	public void add(ArrayList<P> p) {
		this.p = p;
	}
	int getCountOdd() {
		int count = 0;
		for(P value : p) {
			System.out.println(value.getClass().getName());
			if(!value.getClass().getName().equals("java.lang.Integer")) {
				continue;
			}
			if((int)value % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	int getCountPrime() {
		int count = 0;
		for(P value : p) {
			System.out.println(value.getClass().getName());
			if(!value.getClass().getName().equals("java.lang.Integer")) {
				continue;
			}
			boolean broke = false;
			for(int i = 2; i < (int) value; i++) {
				if((int) value % i == 0) {
					broke = true;
					break;
				}
			}
			if(!broke) {
				count++;
			}
		}
		return count;
	}
	int getCountPalindrome() {
		int count = 0;
		for(P value : p) {
			String temp = value.toString();
			int size =  temp.length(), i;
			for(i = 0; i < size / 2; i++) {
				if(temp.charAt(i) != temp.charAt(size - i - 1)) {
					break;
				}
			}
			if(i == size / 2) count++;
		}
		return count;
	}
}
