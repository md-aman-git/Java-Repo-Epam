package day9;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintWriter writer = new PrintWriter(System.out);
			writer.write("Java Training is being conducted...");
			writer.flush();
			writer.close();
			

			String path = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
					"\\\\DemoJava\\\\testPrintWriter.txt";
			PrintWriter writer1 = new PrintWriter(new File(path));
			writer1.write("Java Training on Sprint, Hibernet, JSP, Servelet...");
			writer1.flush();
			writer1.close();
			System.out.println("PrintWriter succesfully executed");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
