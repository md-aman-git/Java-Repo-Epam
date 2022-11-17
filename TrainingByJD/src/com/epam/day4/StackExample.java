package com.epam.day4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<>();
		st.push("Aman");
		st.push("Rahul");
		st.push("Ilyas");
		st.push("Sweta");
		
		String top = st.peek();
		System.out.print("Top element : " + top);
		st.pop();
		System.out.println("\nAfter pop : ");
		Iterator<String> it = st.iterator();
		while(it.hasNext()) {
			System.out.print("\n" + it.next());
		}
		Queue<String> q = new LinkedList<>();
	}

}
