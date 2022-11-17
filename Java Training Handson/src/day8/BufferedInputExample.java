
package day8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = 
					new FileInputStream("C:\\\\Users\\\\Md_Aman\\\\Documents\\\\DemoJava\\\\test2.txt");
			BufferedInputStream bin = new BufferedInputStream(fis);
			int i;
			while((i = bin.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
			bin.close();
			System.out.println("\nSuccessfully written bytes");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
