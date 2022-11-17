package com.epam.mockitoexample;

import java.util.ArrayList;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class StudentFunctions {
	private static int id = 1;
	private ArrayList<Student> students;
	public String registerStudent(String name) {
		System.out.println("Student success added...");
		Student stud = new Student(String.valueOf(id++), name, true);
		//populateList(stud);
		return stud.getStudId();
	}
	public boolean payFees(String studId, int monthNum) {
		for(Student st : students) {
			if(st.getStudId().equals(studId)) return st.isPaid();
		}
		return false;
	}
	public void populateList(Student student) {
		students.add(student);
	}
}
