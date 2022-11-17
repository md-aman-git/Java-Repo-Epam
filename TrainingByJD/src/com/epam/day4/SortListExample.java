package com.epam.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SortListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Aman");
		list.add("Rahul");
		list.add("Ilyas");
		list.add("Vaibhav");
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		list.add("New name");
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		list.add("Own Comparator");
		list.sort(new MyComparator());
		System.out.println(list);
		
		Set<String> set = new HashSet<>();
		
	}

}
