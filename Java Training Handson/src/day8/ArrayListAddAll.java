package day8;

import java.util.ArrayList;

public class ArrayListAddAll {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Lion");
		al.add("Cheetah");
		al.add("Elephant");
		System.out.println(al);
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Apple");
		al1.add("Banana");
		al1.add("Orange");
		al.add(2, "IndexInsert");
		al.addAll(al1);
		System.out.println("After addAll al1 : " + al);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("ABC");
		al2.add("CDE");
		al2.add("EFG");
		al2.add("Apple");
		al.addAll(1, al2);
		System.out.println("After addAll al2 : " + al);
		al.removeAll(al1);//note:it removes also elements other array 
		//if it contains same elements as in al1.
		System.out.println("After removeAll al1 : " + al);
		al.removeIf(str -> str.contains("IO"));
		al.removeIf(str -> str.contains("Lion"));
		System.out.println("After removeAll al1 : " + al);
	}
}
