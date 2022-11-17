package day8;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackExampl1 {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("Hello");
		st.push("There");
		st.push("How");
		st.push("Are");
		st.push("You");
		st.pop();
		st.pop();
		Iterator<String> itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
