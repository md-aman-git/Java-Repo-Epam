package com.epam.designpattern.generics;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display("We are learning Generics.");
		
		print("Print messages Generics.");
		
		multiply(3, 9);
		
		addString(8, "eight");
		
		//generic usage
		ArrayList<String> arr = new ArrayList();
		arr.add("Aman");
		arr.add("Name");
		//arr.add(2);
		String value1 = arr.get(0);
		String value2 = arr.get(1);
		//String value3 = arr.get(2);
		
		
		
		//User defined generic class demo
		Box box = new Box();
		box.add("Message");
		box.add(5);
		System.out.println("BOX : " + box.get());
		
		Box<String> boxWithType = new Box();
		boxWithType.add("Message");
		//boxWithType.add(5);//compiler error bcz type is String
		System.out.println("BOX : " + boxWithType.get());
		
		//Generic with two parameters as object
		Generic<String, Integer> generic 
			= new Generic<String, Integer>();
		generic.add("Hello", 10);
		System.out.println(generic.getFirst() + 
				" : " + generic.getSecond());
		
	}
	
	static void display(String message) {
		System.out.println(message);
	}
	
	static <T> void print(T message) {
		System.out.println(message);
	}
	
	static <T extends Number, 
		S extends Number> void multiply(T op1, S op2) {
		
		int result = (Integer)op1 * (Integer) op2;
		System.out.println(result);
		
	}
	static <T extends Number, S> void addString(T op1, 
			S op2) {
		System.out.println(op1 + " : " + op2);
	}
}
