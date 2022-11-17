package com.epam.day4.client;

import java.util.ArrayList;
import java.util.Collections;

import com.epam.day4.assignment.ClassStudent;
import com.epam.day4.assignment.StudentMarksComparator;

public class StudentClient {

	public static void main(String[] args) {
		ClassStudent X1 = new ClassStudent("Rahul", "Maths", 76);
		ClassStudent X2 = new ClassStudent("Aman", "Physics", 98);
		ClassStudent X3 = new ClassStudent("Ilyas", "Physics", 67);
		ClassStudent X4 = new ClassStudent("Vinay", "Maths", 87);
		ClassStudent X5 = new ClassStudent("Sweta", "Maths", 99);
		ArrayList<ClassStudent> xthStudents = new ArrayList<>();
		xthStudents.add(X1);
		xthStudents.add(X2);
		xthStudents.add(X3);
		xthStudents.add(X4);
		xthStudents.add(X5);
		Collections.sort(xthStudents, new StudentMarksComparator());
		System.out.println("---------Class X---------");
		System.out.println("Maths :");
		for(ClassStudent st : xthStudents) {
			if(st.getSubject().equalsIgnoreCase("maths"))
				System.out.println(st.getName() + " " + st.getMarks());
		}
		System.out.println("Physics :");
		for(ClassStudent st : xthStudents) {
			if(st.getSubject().equalsIgnoreCase("physics"))
				System.out.println(st.getName() + " " + st.getMarks());
		}
		ClassStudent XI1 = new ClassStudent("Aman", "Maths", 86);
		ClassStudent XI2 = new ClassStudent("Vaibhav", "Physics", 88);
		ClassStudent XI3 = new ClassStudent("Shivkanya", "Physics", 77);
		ClassStudent XI4 = new ClassStudent("Shubhangi", "Maths", 87);
		ClassStudent XI5 = new ClassStudent("Vijaya", "Maths", 79);
		ArrayList<ClassStudent> xithStudents = new ArrayList<>();
		xithStudents.add(XI1);
		xithStudents.add(XI2);
		xithStudents.add(XI3);
		xithStudents.add(XI4);
		xithStudents.add(XI5);
		Collections.sort(xithStudents, new StudentMarksComparator());
		System.out.println("---------Class XI---------");
		System.out.println("Maths :");
		for(ClassStudent st : xithStudents) {
			if(st.getSubject().equalsIgnoreCase("maths"))
				System.out.println(st.getName() + " " + st.getMarks());
		}
		System.out.println("Physics :");
		for(ClassStudent st : xithStudents) {
			if(st.getSubject().equalsIgnoreCase("physics"))
				System.out.println(st.getName() + " " + st.getMarks());
		}
	}

}
