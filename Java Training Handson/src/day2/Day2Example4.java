package day2;
import java.util.Scanner;

class Runner {
	void prize() {
		int [] run = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 6; i++) {
			System.out.println("Enter " + (i + 1) + "th runner time = ");
			run[i] = sc.nextInt();
		}
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(run[i] > run[j]) {
					int temp = run[i];
					run[i] = run[j];
					run[j] = temp;
				}
			}
		}
		System.out.println("First 3 prizes goes to = " + run[0] + ", " + run[1] + ", " + run[2]);
	}
}
public class Day2Example4 {
	public static void main(String [] args) {
		Runner run = new Runner();
		run.prize();
	}
}
