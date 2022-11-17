package com.epam.day8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strArr = {"Hello", "Aman", "How", "Are", "You", "?"};
		List<String> listStr = Arrays.asList(strArr);
		Optional<String> option = listStr.stream().reduce((s1, s2) -> s1 + " " + s2);
		
		if(option.isPresent()) {
			System.out.println("Message after joining (reducing) each string : " + option.get());
		}
		//
		int product = IntStream.range(2, 8).skip(2).reduce(1, (a, b) -> a * b);
		System.out.println("Product in range of [2, 8) skipping first 2 elements : " + product);
		//
		Integer [] intArr = {2, 4, 7, 1, 9, 2};
		List<Integer> listInt = Arrays.asList(intArr);
		int sum = listInt.stream().reduce(0, (i, j) -> i + j);
		System.out.println("Sum int the array listInt : " + sum);
	}

}
