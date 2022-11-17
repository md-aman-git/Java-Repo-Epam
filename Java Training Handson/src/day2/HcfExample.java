package day2;

import java.util.Scanner;

class HcfClass {
	int num1, num2, num3;
	public HcfClass(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		
	}
	int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	void display(int gcd) {
		System.out.print("HCF of " + num1 + 
				", " + num2 + ", " + num3 + " = " + gcd);
	}
}
public class HcfExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Enter three numbers with space = ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		HcfClass hcf = new HcfClass(num1, num2, num3);
		int gcd = hcf.gcd(num1, hcf.gcd(num2, num3));
		hcf.display(gcd);
	}
}
