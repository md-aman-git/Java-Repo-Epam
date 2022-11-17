package com.epam.designpattern.generics;

/**
 * Own Generic implementation to understand
 * with two objects as parameter.
 * @author Md Aman
 * */
public class Generic<T, S> {
	private T t;
	private S s;
	void add(T t, S s) {
		this.t = t;
		this.s = s;
	}
	public T getFirst() {
		return t;
	}
	public S getSecond() {
		return s;
	}
}
