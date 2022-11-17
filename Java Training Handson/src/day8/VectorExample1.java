package day8;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample1 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		list.add("Hello");
		list.add("There");
		list.add("How");
		list.add("Are");
		list.add("You");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
