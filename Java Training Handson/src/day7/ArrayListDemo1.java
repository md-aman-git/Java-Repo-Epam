package day7;

import java.util.*;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("India");
		al.add("USA");
		al.add("Australia");
		al.add("Bangladesh");
		System.out.println("Arraylist collection = " + al);
		al.add(1, "Nepal");
		System.out.println("Arraylist collection = " + al);
		al.remove(2);
		System.out.println("Arraylist collection = " + al);
		Collections.sort(al);
		System.out.println("Sorted Arraylist collection = " + al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse Sorted Arraylist collection = " + al);
	}
}
