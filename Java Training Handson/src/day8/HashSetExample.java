
package day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> list = new HashSet<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
