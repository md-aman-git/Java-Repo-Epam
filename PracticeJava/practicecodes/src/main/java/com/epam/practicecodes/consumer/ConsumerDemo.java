package com.epam.practicecodes.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

class MyClass {
	static void showValue(int value) {
		System.out.println("Value : " + value);
	}
	static void showMessage(String message) {
		System.out.println("Message : " + message);
	}
	static void lower(String value) {
		System.out.println("Lower Case : " + value.toLowerCase());
	}
}
class MyBiClass {
	static void showDetails(String name, int age) {
		System.out.println("Name : " + name + ", Age : " + age);
	}
//	static void showMessage(String message) {
//		System.out.println("Message : " + message);
//	}
//	static void lower(String value) {
//		System.out.println("Lower Case : " + value.toLowerCase());
//	}
}
public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer1 = MyClass::showValue;
		consumer1.accept(12);
		Consumer<String> consumer2 = MyClass::showMessage;
		
		Consumer<String> consumer3 = MyClass::lower;
		consumer2.andThen(consumer3).accept("Hey Bud!");
		
		BiConsumer<String, Integer> bi1 = MyBiClass::showDetails;
		bi1.accept("Aman", 23);
		bi1.accept("Shubhi", 23);
		bi1.accept("Shubhangi", 23);
		bi1.accept("Rahul", 23);
		
		
		
	}

}
