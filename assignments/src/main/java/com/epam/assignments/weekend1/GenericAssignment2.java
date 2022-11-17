package com.epam.assignments.weekend1;


public class GenericAssignment2<T> {
	//private T t;
	private T[] t;
	void add(T[] t) {
		this.t = t;
	}
	void exchangePosition(int i, int j) {
		T temp = t[i];
		t[i] = t[j];
		t[j] = temp;
	}
}
