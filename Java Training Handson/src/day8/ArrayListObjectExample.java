package day8;

import java.util.ArrayList;

class Student {
	int roll, age;
	String name;
	Student(int roll, int age, String name) {
		this.roll = roll;
		this.age = age;
		this.name = name;
	}
}
public class ArrayListObjectExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, 18, "EPAM");
		Student s2 = new Student(2, 20, "ICE");
		Student s3 = new Student(3, 17, "TRIANGLE");
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		for(Student st : student) {
			System.out.println("Name : " + st.name + 
					", Age : " + st.age + ", Roll : " + st.roll);
		}
	}
}
