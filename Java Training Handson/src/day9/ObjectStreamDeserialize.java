package day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
				"\\\\DemoJava\\\\objectFileStudent.txt";
		try {
			FileInputStream fin = new FileInputStream(path);
			ObjectInputStream objIn = new ObjectInputStream(fin);
			Student student = (Student) objIn.readObject();
			objIn.close();
			fin.close();
			System.out.println("Name : " + student.name + ", ID : " + student.id);
			System.out.println("Succes executed...");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
