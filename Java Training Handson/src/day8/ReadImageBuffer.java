
package day8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadImageBuffer {
	public static void main(String[] args) {
		try {
			String path = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
					"\\\\DemoJava\\\\EPAM_Logo.jpg";
			FileInputStream fis = 
					new FileInputStream(path);
			BufferedInputStream bin = new BufferedInputStream(fis);
			int i;
			while((i = bin.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
			bin.close();
			System.out.println("\nSuccessfully Read bytes");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
