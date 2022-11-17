package day4;

interface A {
	void print();
	default void defMethod() {
		System.out.println("This is default method in interface A...");
	}
	static void show() {
		System.out.println("This is static method in interface A...");
	}
	interface Nested {
		void nestMethod();
	}
    class classInterface {
		void classNestMethod() {
			System.out.println("This is nestClass method in interface A...");
		}
	}
}
interface B extends A {
	void display();
}
class C implements A, B, A.Nested {

	public void display() {
		System.out.println("This is display method in interface B...");
	}
	public void print() {
		System.out.println("This is print method in interface A...");
	}
	public void nestMethod() {
		System.out.println("This is nestMethod method in nestInterface A...");
	}
}
public class Day4InterfaceExample {

	public static void main(String[] args) {
		C obj = new C();
		obj.display();
		obj.print();
		obj.nestMethod();
		A.classInterface c = new A.classInterface();
		c.classNestMethod();
		A.show();
		obj.defMethod();
	}

}
