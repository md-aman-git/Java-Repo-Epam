package day9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
public class ObjectStreamSerializeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\\\Users\\\\Md_Aman\\\\Documents" + 
				"\\\\DemoJava\\\\objectFileStudent.txt";
		try {
			FileOutputStream fout = new FileOutputStream(path);
			ObjectOutputStream objOs = new ObjectOutputStream(fout);
			Student s1 = new Student(120, "EPAM System");
			objOs.writeObject(s1);
			objOs.flush();
			objOs.close();
			fout.close();
			System.out.println("Succes executed...");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
