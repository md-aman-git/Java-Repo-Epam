
package day8;
import java.io.*;
import java.util.ArrayList;

public class DeserializationArray {
	public static void main(String[] args) {
		try {
			FileInputStream fis = 
					new FileInputStream("C:\\Users\\Md_Aman\\Documents\\DemoJava\\test.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<String> list = (ArrayList<String>) ois.readObject();
			System.out.println(list);
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
