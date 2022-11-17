
package day8;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = 
					new FileOutputStream("C:\\\\Users\\\\Md_Aman\\\\Documents\\\\DemoJava\\\\test2.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fos);
			String str = "Buffered Output Stream";
			byte [] arr = str.getBytes();
			bout.write(arr);
			bout.flush();
			fos.close();
			bout.close();
			System.out.println("Successfully written bytes");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
