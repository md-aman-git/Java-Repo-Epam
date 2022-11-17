
public class ExcepExample {
	public static void main(String[] args) {

		int a = 23;
		int b = 12;
		int c = 0;
		int d = a / b;
		System.out.println(d);
		try {
			int e = a / c;
			System.out.println(e);
			System.out.println("All good");
		} catch (ArithmeticException e) {
			System.out.println("Catch block");
			System.out.println(e);
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("Program Complete");
		int[] array = { 3, 2, 5, 7 };
		System.out.println("Array[2] = " + array[2]);
		//System.out.println("Array[8] = " + array[8]);
		// array[10] = 5; //index out of bound exception
	}
}
