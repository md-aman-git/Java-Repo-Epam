package Day5;

import java.util.Scanner;
import java.util.regex.Pattern;

class RE1 {
	void regexE1() {
		System.out.println(Pattern.matches("[amn]", "am"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches(".[amn]", "pa"));
		System.out.println(Pattern.matches("..[amn]", "an"));
		System.out.println(Pattern.matches("..[amn]", "pqm"));
	}
	void regexE2() {
		System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("[amn]+", "amn"));
		System.out.println(Pattern.matches("[amn]?", "aaa"));
		System.out.println(Pattern.matches("[amn]+", "aaa"));
		System.out.println(Pattern.matches("[ammn]*", "ammmma"));
		System.out.println(Pattern.matches("\\d*", "12342"));
		System.out.println(Pattern.matches("\\D*", "mak"));
		System.out.println(Pattern.matches("\\D+", "mak"));
	}
	String bankIFSC(String ifsc) {
		ifsc = ifsc.toLowerCase();
		String res = "";
		if(Pattern.matches("hdfc\\d*", ifsc)) {
			res += "HDFC";
		}
		else if(Pattern.matches("icic\\d*", ifsc)) {
			res += "ICICI";
		}
		else if(Pattern.matches("sbin\\d*", ifsc)) {
			res += "SBI";
		}
		else {
			res += "Other Bank";
		}
		return res;
	}
}
public class RegexExample2 {
	public static void main(String [] args) {
		RE1 re = new RE1();
		//re.regexE2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter IFSC code = ");
		String ifsc = sc.next();
		sc.close();
		if(ifsc.length() == 11) {
			System.out.println("Your Bank Name = " + 
					re.bankIFSC(ifsc));
		}
		else {
			System.out.println("Please enter correct IFSC code.");
		}
	}
}