import java.util.Scanner;

class FactorClass {
	void computer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		sc.close();
		System.out.print("\nFactors of " + number + " are : ");
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
public class FactorNumberExample {
	public static void main(String[] args) {
		FactorClass fc = new FactorClass();
		fc.computer();
	}
}
