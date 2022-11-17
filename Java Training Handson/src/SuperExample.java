
class First {

	String color = "White";

	void disp() {
		System.out.println("From Parent Class");
	}
}

class Second extends First {
	String color = "Brown";

	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
		disp();
		super.disp();
	}

	void disp() {
		System.out.println("From Child Class");
	}
}

public class SuperExample {

	public static void main(String[] args) {

		Second obj = new Second();

		obj.printColor();
	}
}
