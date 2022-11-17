
package day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = 
					new FileInputStream("C:\\\\Users\\\\Md_Aman\\\\Documents\\\\DemoJava\\\\testFOSBytesArr.txt");
			//int value = fis.read();
			//System.out.println((char)value);
			int i = 0;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
			System.out.println("Successfully written bytes");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
