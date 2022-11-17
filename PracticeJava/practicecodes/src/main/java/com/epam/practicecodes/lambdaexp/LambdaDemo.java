package com.epam.practicecodes.lambdaexp;

interface LambdaOne {
	void show();
}
interface LambdaTwo {
	void printValue(int value);
}
public class LambdaDemo {
	public static void main(String[] args) {
		
//		LambdaOne one = new LambdaOne() //anonymous class since no name of below class
//		{
//			 public void show() {
//				System.out.println("Hello lambda one");
//			}
//		};
		LambdaOne one = () -> System.out.println("Hello");
		one.show();
		
		LambdaTwo two = i -> System.out.println("Value : " + i);
		two.printValue(12);
	}
}
