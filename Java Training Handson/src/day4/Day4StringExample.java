package day4;
import java.util.Scanner;

public class Day4StringExample {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int words = 1;
		boolean space = false;
		int index = 0, last = s.length() - 1;
		while(s.charAt(index) == ' ') {
			index++;
		}
		while(s.charAt(last) == ' ') {
			last--;
		}
		for(int i = index; i <= last; i++) {
			if(s.charAt(i) == ' ' && !space) {
				words++;
				space = true;
			}
			else if(s.charAt(i) != ' ') {
				space = false;
			}
		}
		System.out.println(words);
	}
}
