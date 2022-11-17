package day8;

import java.util.ArrayList;

public class MergeArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(6);
		list2.add(8);
		list2.add(7);
		list2.add(9);
		list2.add(10);
		list.addAll(list2);
		System.out.println(list);
		//empty non-empty etc
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		if(list3.isEmpty() && list4.isEmpty()) {
			System.out.println("Both list are empty");
		}
		else if(list3.isEmpty() && !list4.isEmpty()) {
			System.out.println("list3 is empty and list4 is not empty");
		}
		else if(!list3.isEmpty() && list4.isEmpty()) {
			System.out.println("list3 is not empty and list4 is empty");
		}
		else {
			System.out.println("Both are not empty");
		}
		list.addAll(list4);
		System.out.println(list3);
	}
}
