package com.epam.day7;

@FunctionalInterface
interface Circle {
	double area(double radius);
}
@FunctionalInterface
interface Hello {
	void sayHello();
}

@FunctionalInterface
interface Palindrome {
	boolean isPalindrome(String str);
}
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Circle c1 = radius -> Math.PI * radius * radius;
		//() -> {}; //format of lambda expression
		//if one argument then no need of parenthesis ()
		//if one line statement then no need of curly braces {}
		//like above object creation
		
		Circle circle = (radius) -> {return Math.PI * radius * radius;};
		
		System.out.println("Area of circle : " + circle.area(5));
		
		Hello hello = () -> System.out.println("Hello world!");
		hello.sayHello();
		
		Palindrome p = str -> {
			str = str.toLowerCase();
			int size = str.length();
			for(int i = 0; i < size / 2; i++) {
				if(str.charAt(i) != str.charAt(size - i - 1)) return false;
			}
			return true;
		};
		
		System.out.println(p.isPalindrome("Jahaj"));
	}

}
