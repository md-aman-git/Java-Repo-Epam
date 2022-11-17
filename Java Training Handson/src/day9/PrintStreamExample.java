package day9;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String path = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
					"\\\\DemoJava\\\\testPrintStream.txt";
			FileOutputStream fout = new FileOutputStream(path);
			PrintStream ps = new PrintStream(fout);
			ps.println(2022);
			ps.println("Hello World!");
			ps.println("Printed in Stream.");
			ps.close();
			fout.close();
			System.out.println("Printed Stream Succesfully...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
