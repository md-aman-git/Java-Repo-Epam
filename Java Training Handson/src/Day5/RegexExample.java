package Day5;

import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String [] args) {
		System.out.println("Second char is s having size 2 : " +
				    Pattern.matches(".s", "as"));
		System.out.println("Second char is s having size 2 : " + 
					Pattern.matches(".s", "ast"));
		System.out.println("Second char is s having size 2 : " +
					Pattern.matches(".s", "am"));
		System.out.println("Third char is t having size 3 : " +
					Pattern.matches("..t", "ast"));
		System.out.println("Third char is p having size 3 : " +
					Pattern.matches("..p", "aspt"));
	}
}
