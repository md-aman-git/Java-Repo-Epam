package com.epam.java8features.lambdaexpress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNumberLambda {
	public void sortingMethod() {
		Student s1 = new Student(1, 21, "aman");
		Student s2 = new Student(4, 11, "rahul");
		Student s3 = new Student(2, 27, "ilyas");
		Student s4 = new Student(6, 24, "abc");
		List<Student> student = new ArrayList<>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		Collections.sort(student, new CompareClass());
		for(Student s : student) {
			System.out.println(s.getName() + ", ");
		}
	}
}
