import java.util.Scanner;

public class TernaryOpExample {
	public static void main(String [] args) {
		int num1, num2, small, large;
		System.out.print("Enter two numbers with space = ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
		small = num1 > num2 ? num2 : num1;
		large = num1 > num2 ? num1 : num2;
		System.out.println("Small number = " + small 
				+ ", Large number = " + large);
	}
}
