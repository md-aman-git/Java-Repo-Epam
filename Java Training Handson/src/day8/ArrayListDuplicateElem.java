package day8;

import java.util.ArrayList;

public class ArrayListDuplicateElem {
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
		list.retainAll(list2);
		System.out.println(list);
	}
}
