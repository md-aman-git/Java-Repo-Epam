package day2;
import java.util.Scanner;

public class Day2Example1 {
	static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	static int lcm(int a, int b, int c) {
		int l = (a * b) / gcd(a, b); // lcm of two num a and b
		return ((l) * c) / gcd(l, c);
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("LCM = " + lcm(a, b, c));
	}
}
