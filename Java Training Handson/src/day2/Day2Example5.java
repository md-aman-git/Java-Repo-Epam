package day2;
import java.util.Scanner;

class Pattern {
	void show() {
		System.out.println("Enter number of row = ");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}
public class Day2Example5 {
	public static void main(String [] args) {
		Pattern pt = new Pattern();
		pt.show();
	}
}
