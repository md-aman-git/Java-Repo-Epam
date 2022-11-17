package day8;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = 
					new FileOutputStream("C:\\\\Users\\\\Md_Aman\\\\Documents\\\\DemoJava\\\\testFOS.txt");
			fos.write(65);
			fos.write(65);
			fos.write(97);
			fos.close();
			System.out.println("Successfully written bytes");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
