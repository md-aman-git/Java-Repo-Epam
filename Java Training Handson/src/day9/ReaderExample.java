package day9;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader reader = 
					new FileReader("C:\\\\Users\\\\Md_Aman\\\\Documents\\\\DemoJava\\\\testFOSBytesArr.txt");
			int data = 0;
			while((data = reader.read()) != -1) {
				System.out.print((char)data);
			}
			reader.close();
			System.out.println("\nSuccessfully written bytes");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
