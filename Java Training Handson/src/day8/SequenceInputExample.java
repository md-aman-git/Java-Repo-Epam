
package day8;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputExample {
	public static void main(String[] args) {
		try {
			String path1 = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
					"\\\\DemoJava\\\\test.txt";
			String path2 = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
					"\\\\DemoJava\\\\test2.txt";
			FileInputStream fis1 = 
					new FileInputStream(path1);
			FileInputStream fis2 = 
					new FileInputStream(path2);
			SequenceInputStream si = new SequenceInputStream(fis1, fis2);
			int i;
			while((i = si.read()) != -1) {
				System.out.print((char)i);
			}
			fis1.close();
			fis2.close();
			si.close();
			System.out.println("\nSuccessfully Read bytes");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
