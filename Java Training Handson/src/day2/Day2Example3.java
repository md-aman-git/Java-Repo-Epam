package day2;
import java.util.Scanner;

public class Day2Example3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		while(number > 0) {
			sum += (number % 10);
			number /= 10;
		}
		System.out.println("Sum = " + sum);
	}
}
