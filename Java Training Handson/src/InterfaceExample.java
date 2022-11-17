interface Printable {
	void print();
}

class Laser implements Printable {
	public void print() {
		System.out.println("Printing done in a Laser Printer");
	}
}

class Inkjet implements Printable {
	public void print() {
		System.out.println("Printing done in a Inkjet Printer");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// we can make object of interface
		// but can not initialize with the interface as show below.
		// Printable l1= new Printable(); //error
		Printable l1 = new Laser(); // up-casting
		Laser l2 = new Laser();
		Inkjet i3 = new Inkjet();

		l1.print();
		l2.print();
		i3.print();
	}
}
