package com.epam.designpattern.mvc;

public class StudentView {
	public void showStudentDetails(int roll, String name) {
		System.out.println("Student Name : " + name);
		System.out.println("Student Roll : " + roll);
	}
}
