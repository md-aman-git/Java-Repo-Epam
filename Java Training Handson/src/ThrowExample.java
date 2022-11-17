
public class ThrowExample {

	static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not eligible to vote");
		} else {
			System.out.println("Eligible to Vote");
		}
	}

	public static void main(String[] args) {
		validate(18);
		System.out.println("Done");
	}
}