package com.epam.practicecodes.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(2, 5, 9, 1, 4, 7);
//		for(int i = 0; i < values.length; i++) {
//			System.out.println(values[i]);
//		}
		
//		enhanced for loop
//		for(int i : values) {
//			System.out.println(i);
//		}
		
//		java 8 forEach
		values.forEach(consumer -> System.out.println(consumer));
	}
}
