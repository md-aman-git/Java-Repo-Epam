package day2;
import java.util.Scanner;

class Pattern2 {
	void show() {
		System.out.println("Enter number of row = ");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int var = 3;
		int space = n;
		for(int i = 1; i <= n * 2 - 1; i++) {
			for(int k = 1; k <= space; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= var; j++) {
				if(j % 2 == 0)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			for(int k = 1; k <= 2 * space; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= var; j++) {
				if(j % 2 == 0)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			if(i / n != 1) {
				var += 2;
				space--;
			}
			else {
				var -= 2;
				space++;
			}
			System.out.println();
			
		}
	}
}
public class Day2AssignmentStarPatttern {
	public static void main(String [] args) {
		Pattern2 pt = new Pattern2();
		pt.show();
	}
}
