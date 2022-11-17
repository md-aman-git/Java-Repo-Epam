import java.util.Scanner;

public class IfElseExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("Enter first number = ");
		num1 = sc.nextInt();
		sc.close();
		System.out.print("Score : ");
		if (num1 >= 70) {
			System.out.println("Distinction");
		} else if (num1 >= 60) {
			System.out.println("FirstClass");
		} else if (num1 >= 50) {
			System.out.println("SecondClass");
		} else if (num1 >= 40) {
			System.out.println("Passed");
		} else {
			System.out.println("Fail");
		}
	}

}