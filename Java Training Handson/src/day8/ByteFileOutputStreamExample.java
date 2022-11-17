package day8;

import java.io.FileOutputStream;

public class ByteFileOutputStreamExample {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = 
					new FileOutputStream("C:\\\\Users\\\\Md_Aman\\\\Documents\\\\DemoJava\\\\testFOSBytesArr.txt");
			String str = "EPAM System";
			byte [] byteArr = str.getBytes();
			fos.write(byteArr);
			fos.close();
			System.out.println("Successfully written bytes");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
