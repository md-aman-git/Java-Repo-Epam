package com.epam.day3;

import java.util.ArrayList;
import java.util.Iterator;
public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Jayanta", "ID1", "Engineering");
		Student s2 = new Student("Moumita", "ID2", "Litterature");
		Student s3 = new Student("Hemen", "ID3", "Physics");
		Student s4 = new Student("Rupa", "ID4", "Physics");
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		printStudentInfo(students);
		students.remove(1);

		printStudentInfo(students);

		students.add(0, s4);
		printStudentInfoUsingIterator(students);
		ArrayList<Student> studentscopy = new ArrayList<>();
		studentscopy.addAll(students);
		printStudentInfoUsingIterator(studentscopy);
	}

	static void printStudentInfo(ArrayList<Student> stuData) {
		System.out.println("\n----Printing Student Data from For Loop-----\n");
		System.out.println("\nsize of Students collection is =" + stuData.size());
		for (Student s : stuData) {
			System.out.println(s);
		}
	}

	static void printStudentInfoUsingIterator(ArrayList<Student> stuData) {

		System.out.println("\n----Printing Student Data from Iterator-----\n");
		System.out.println("\nsize of Students collection is =" + stuData.size());
		Iterator<Student> i1 = stuData.iterator();
		while (i1.hasNext()) {
			Student s = i1.next();
			System.out.println(s);
		}
	}
}