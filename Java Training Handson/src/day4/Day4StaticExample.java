package day4;

class StaticClass {
    StaticClass() {
		System.out.println("Static class constructor invoked...");
	}
	static void staticMethod() {
		System.out.println("Static method invoked...");
	}
	void nonStaticMethod() {
		System.out.println("Non-Static method invoked...");
	}
	static {
		System.out.println("Static block in class invoked...");
	}
}
public class Day4StaticExample {
	public static void main(String [] args) {
		StaticClass.staticMethod();
		StaticClass sc = new StaticClass();
		sc.nonStaticMethod();
	}
}
