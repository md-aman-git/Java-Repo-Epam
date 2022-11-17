package com.epam.day5;

import java.util.ArrayList;

public class TestCollection {
//  wild card generics
//	static void fun(List<?> t) {
//	System.out.println(t.get(0));
//}
//public static void main(String[] args) {
//	List<Integer> list = new ArrayList<>();
//	list.add(34);
//	fun(list);
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);
	}

}
