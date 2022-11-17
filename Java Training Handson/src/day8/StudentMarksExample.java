package day8;

import java.util.ArrayList;

class StudentMarks {
	int roll, marks;
	String name;
	public StudentMarks(int roll, int marks, String name) {
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	
}
public class StudentMarksExample {
	public static void main(String[] args) {
		ArrayList<StudentMarks> student = new ArrayList<StudentMarks>();
		StudentMarks s1 = new StudentMarks(1, 78, "EPAM");
		StudentMarks s2 = new StudentMarks(2, 79, "ICE");
		StudentMarks s3 = new StudentMarks(3, 90, "AGE");
		StudentMarks s4 = new StudentMarks(4, 81, "COLLISION");
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		for(StudentMarks sm : student) {
			if(sm.marks > 80) {
				System.out.println(sm.name);
			}
		}
	}
}
