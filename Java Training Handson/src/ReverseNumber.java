import java.util.Scanner;

class ReverseClass {
	void computer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		sc.close();
		int res = 0;
		while(number > 0) {
			res = 10 * res + (number % 10);
			number /= 10;
		}
		System.out.print("\nReversed number : " + res);
	}
}
public class ReverseNumber {
	public static void main(String[] args) {
		ReverseClass rc = new ReverseClass();
		rc.computer();
	}
}
