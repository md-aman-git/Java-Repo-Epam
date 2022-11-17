
package day8;

import java.util.ArrayList;

public class ArrayListExample {
	static void printFruits(ArrayList<String> list, String op) {
		System.out.print("\nPrinting elements after " + op + " : ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Orange");
		list.add("Apple");
		for(String str : list) {
			System.out.print(str + " ");
		}
		printFruits(list, "No modification");
		//list.get(5); //index out of bound exception
		list.set(1, "Banana");
		printFruits(list, "set at index");
		list.add("Grapes");
		printFruits(list, "add method");
		list.add(2, "Pinapple");
		printFruits(list, "add at index");
		list.remove(3);
		printFruits(list, "remove at index");
	}
}
