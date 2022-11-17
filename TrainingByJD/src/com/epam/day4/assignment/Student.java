package com.epam.day4.assignment;

public class Student {
	private String name, subject;
	private int marks;
	public Student(String name, String subject, int marks) {
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}
	
}
