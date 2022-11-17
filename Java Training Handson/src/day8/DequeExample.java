
package day8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class DequeExample {
	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<String>();
		queue.add("Hello");
		queue.add("There");
		queue.add("How");
		queue.add("Are");
		queue.add("You");
		System.out.println("head : " + queue.peek());
		System.out.println("head : " + queue.element());
		System.out.println("Iterating : ");
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		queue.add("Inserted New");
		System.out.println("Iterating after remove : ");
		for(String str : queue) {
			System.out.print(str + " ");
		}
	}
}
