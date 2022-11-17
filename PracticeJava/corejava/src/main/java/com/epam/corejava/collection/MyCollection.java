package com.epam.corejava.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class ListExample {
	static void method() {
		List<String> strings = new ArrayList<String>();
		strings.add("B");
		strings.add("B");
		strings.add("D");
		strings.add("P");
//		strings.remove(0);
		System.out.println(strings);
		strings.removeIf(p -> p.startsWith("B"));
		System.out.println("List : " + strings);
	}
}
class LinkedListExample {
	static void method() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("end");
		list.push("first");
		String elem = list.element();
		System.out.println("Element of LinkedList : " + elem);
		System.out.println("LinkedList : " + list);
	}
}
class DequeExample {
	//doubly ended queue means we can insert and remove from both ends of this queue
	static void method() {
		Deque<String> list = new ArrayDeque<String>();
		list.add("Apple");
		list.add("end");
		list.push("first");
		list.addFirst("added first");
		list.addLast("added last");
		String elem = list.element();
		System.out.println("Element of Deque : " + elem);
		System.out.println("Deque : " + list);
		list.removeFirst();
		System.out.println("Deque after remove first : " + list);
	}
}
class SetExample {
	//doubly ended queue means we can insert and remove from both ends of this queue
	static void method() {
		Set<String> list = new HashSet<String>();
		list.add("Apple");
		list.add("end");
		list.add("add");
		list.add("end");
		list.add("abc");
		list.add(null);
		list.add(null);
		System.out.println("Set : " + list);
		list.remove("add");
		System.out.println("Set after removing add : " + list);
	}
}
class TreeSetExample {
	static void method() {
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Apple");  
		set.add("Gajar");  
		set.add("Bank");  
		set.add("Super");
		set.add("super");
		System.out.println("TreeSet : " + set);
	}
}
class MapExample {
	static void method() {
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "aaa");
		map.put(4, "bbbb");
		map.put(7, "ppppppp");
		map.put(1, "k");
		map.put(2, "zz");
		map.put(1, "updatedVal");
//		map.put(null, null);
		System.out.println("Map : " + map);
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for(Map.Entry<Integer, String> mapper : entrySet) {
			System.out.println("Key = " + mapper.getKey() + ", Value = " + mapper.getValue());
		}
		//sorting by key
		System.out.println("After sorting map by key asc : ");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("After sorting map by key Desc : ");
		map.entrySet()
			.stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
			.forEach(System.out::println);
		System.out.println("After sorting map by value asc : ");
		map.entrySet()
			.stream().sorted(Map.Entry.comparingByValue())
			.forEach(System.out::println);
		System.out.println("After sorting map by value desc : ");
		map.entrySet()
			.stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			.forEach(System.out::println);
	}
}
public class MyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListExample.method();
		LinkedListExample.method();
		DequeExample.method();
		SetExample.method();
		TreeSetExample.method();
		MapExample.method();
	}

}
