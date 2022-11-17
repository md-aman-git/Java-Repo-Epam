package com.epam.practicecodes.interfacejava8;
interface I {
	void sub();
	default void add() {
		System.out.println("This is default add method");
	}
}
interface J {
	void mul();
	default void add() {
		System.out.println("This is default add method");
	}
}
public interface DefaultStaticInterface {
	void show();
	default void print() {
		System.out.println("This is default print method");
	}
	static void division() {
		System.out.println("This is static division method...");
	}
	
//	we can not create default method in interface which is already there in Object class
//	this below code will give error
//	
//	default boolean equals(Object o) {
//		return true;
//	}
}
@FunctionalInterface
interface K {
	void hide();
	boolean equals(Object o);//it can have declaration of Object class methods
	String toString();//it can have declaration of Object class methods
}
