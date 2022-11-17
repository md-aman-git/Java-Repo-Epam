package day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String path = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
					"\\\\DemoJava\\\\testWriter1.txt";
			FileWriter reader = 
					new FileWriter(path);
			String str = "Java Programming";
			reader.write(str);
			reader.close();
			System.out.println("\nSuccessfully written bytes");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
