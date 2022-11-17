
public class PolymorphismExample {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static String add(String fname, String Sname) {
		return fname + " " + Sname;
	}

	public static void main(String[] args) {

		System.out.println(add(23, 45));

		System.out.println(add(111, 222, 333));

		System.out.println(add("EPAM", "System"));
	}
}
