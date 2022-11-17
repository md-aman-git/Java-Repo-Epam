package day8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Banana");
		list.add("fruit");
		list.add("Apple");
		list.add("Carrot");
		list.add("Fruit");
		list.add("App");
		list.add("Car");
		list.add("Fruit");
		System.out.println("Without sorted list : " + list);
		Collections.sort(list);
		System.out.println("Sorted list : " + list);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(3);
		al.add(1);
		al.add(20);
		al.add(3);
		al.add(10);
		al.add(9);
		System.out.println("Without sorted list : " + al);
		Collections.sort(al);
		System.out.println("Sorted list : " + al);
	}
}
