package com.epam.day3.assignment;

public class GenericCompany<T> {
	T t;
	void set(T t) {
		this.t = t;
	}
	T get() {
		return this.t;
	}
}
