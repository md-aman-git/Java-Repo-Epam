package com.epam.day3;

public class Student {

	String name;
	String id;
	String dept;

	public Student(String name, String id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}

}