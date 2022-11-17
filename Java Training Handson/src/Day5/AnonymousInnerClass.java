package Day5;

abstract class Person {
	abstract void deal();
}
public class AnonymousInnerClass {
	public static void main(String [] args) {
		Person p = new Person() {
			void deal() {
				System.out.println("This is deal method.");
			}
		};
		p.deal();
	}
}
