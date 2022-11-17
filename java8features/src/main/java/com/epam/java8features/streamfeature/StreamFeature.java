package com.epam.java8features.streamfeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFeature {
	public void streamFunction() {
		List<String> list = Arrays.asList("Aman", "Ilyas", "Rahul", "Shivkanya", "Sweta", "Vinay", "", "Vaibhav");
//		List<String> filteredList = new ArrayList<String>();
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).isEmpty()) {
//				System.out.println("Empty string at index : " + i);
//				filteredList.add(list.get(i));
//			}
//		}
		//using filter
		List<String> filteredList = list.stream()
							.filter(str -> !str.isEmpty()) //filters corresponding to predicate
							.limit(5)//limits up-to 5 size
							.collect(Collectors.toList()); //make as a list
		System.out.println("Filter list = " + filteredList);
		
		filteredList.forEach(str -> System.out.println(str));
		String resultJoining = list.stream()
				.filter(str -> !str.isEmpty())
				.collect(Collectors.joining("->"));
		System.out.println("String after joining list of string : " + resultJoining);
	}
}
