package day4;
import java.util.Scanner;

public class Day4NameExample {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String resName = "", shortName = "";
		int index = 0;
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == ' ') {
				index = i + 1;
				shortName = "";
			}
			else if(shortName == "") {
				shortName = name.charAt(index) + "";
				resName += shortName + ".";
			}
		}
		resName = resName.substring(0, resName.length() - 2) 
				+ name.substring(index);
		System.out.println(resName);
	}
}
