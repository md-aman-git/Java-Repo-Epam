package day4;

interface Atwo {
	void show();

	interface Athree {
		void disp();
	}
}

class Btwo implements Atwo {
	public void show() {
		System.out.println(" implements showable");
	}

	public void disp() {
		System.out.println(" implements display");
	}
}

public class NestedInterface {
	public static void main(String[] args) {

		Btwo b = new Btwo();
		b.show();
		b.disp();
	}

}
