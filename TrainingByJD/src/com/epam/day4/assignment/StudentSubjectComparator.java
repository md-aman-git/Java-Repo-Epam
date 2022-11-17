package com.epam.day4.assignment;

import java.util.Comparator;

public class StudentSubjectComparator implements Comparator<ClassStudent> {

	@Override
	public int compare(ClassStudent o1, ClassStudent o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
