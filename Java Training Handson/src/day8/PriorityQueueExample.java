
package day8;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
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
		queue.remove();
		queue.poll();
		System.out.println("Iterating after remove : ");
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
	}
}
