package day9;

import java.io.Console;

public class ConsolePassExample  {
	public static void main (String[] args) {
		Console c = System.console();
		System.out.print("Enter your name : ");
		char [] pass = c.readPassword();
		String password = String.valueOf(pass);
		System.out.println("Welcome " + password);
	}
}
