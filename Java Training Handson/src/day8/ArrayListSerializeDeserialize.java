package day8;
import java.io.*;
import java.util.ArrayList;

public class ArrayListSerializeDeserialize {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("EPAM");
		try {
			FileOutputStream fos = 
					new FileOutputStream("C:\\Users\\Md_Aman\\Documents\\DemoJava\\test.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(list);
			os.close();
			fos.close();
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
