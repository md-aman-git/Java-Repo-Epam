package com.epam.day4.assignment;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<ClassStudent> {

	@Override
	public int compare(ClassStudent o1, ClassStudent o2) {
		// TODO Auto-generated method stub
		if(o1.getMarks() < o2.getMarks()) return 1;
		else if(o1.getMarks() > o2.getMarks()) return -1;
		return 0;
	}

}
