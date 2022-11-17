package day9;

import java.io.Console;

public class ConsoleExample  {
	public static void main (String[] args) throws NullPointerException {
		Console c = System.console();
		System.out.print("Enter your name : ");
		String name = c.readLine();
		System.out.println("Welcome " + name);
	}
}
