package day4;

interface displayable {
	void show();
}

interface showable {
	void print();

	void show();
}

class Mult implements displayable, showable {
	public void print() {
		System.out.println("Implements showable");
	}

	public void show() {
		System.out.println("No ambiguity");
	}
}

public class MultiInheritInterface {
	public static void main(String[] args) {

		Mult ob = new Mult();

		ob.print();
		ob.show();
	}
}
