package day8;

import java.util.ArrayList;

public class ArrayListRetainAll {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Lion");
		al.add("Cheetah");
		al.add("Elephant");
		System.out.println(al);
		ArrayList<String> al1 = new ArrayList<String>();
		System.out.println("before al1 is empty : " + al1.isEmpty());
		al1.add("Apple");
		al1.add("Banana");
		al1.add("Orange");
		al1.add("Lion");
		System.out.println("after insert to al1 is empty : " + al1.isEmpty());
		al.retainAll(al1);//takes intersection
		System.out.println(al);
	}
}

