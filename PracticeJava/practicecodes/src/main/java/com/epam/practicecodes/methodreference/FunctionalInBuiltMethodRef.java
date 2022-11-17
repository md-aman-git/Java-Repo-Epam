package com.epam.practicecodes.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

class Arithmetic {
	static Integer multiply(Integer a, Integer b) {
		return a * b;
	}
	static Integer square(Integer value) {
		return value * value;
	}
	static Integer sumList(List<Integer> list) {
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		return sum;
	}
}
class AdderOverload {
	static Integer add(Integer a, Integer b) {
		return a + b;
	}
	static Float add(Float a, Integer b) {
		return a + b;
	}
	static Float add(Float a, Float b) {
		return a + b;
	}
}
public class FunctionalInBuiltMethodRef {
	public static void main(String[] args) {
//		here we will use BiFunction<T,U,R>
		BiFunction<Integer, Integer, Integer> biFunc = Arithmetic::multiply;
		int result = biFunc.apply(12, 5);
		System.out.println("Result : " + result);
		
//		overloading the function using method reference
		BiFunction<Integer, Integer, Integer> addReturnInt = AdderOverload::add;
		BiFunction<Float, Integer, Float> addReturnFloat1 = AdderOverload::add;
		BiFunction<Float, Float, Float> addReturnFloat2 = AdderOverload::add;
		
		Integer result1 = addReturnInt.apply(12, 34);
		Float result2 = addReturnFloat1.apply(12.0f, 4);
		Float result3 = addReturnFloat2.apply(9.0f, 23.0f);
		
		
		System.out.println("Integer result : " + result1);
		System.out.println("Float1 result : " + result2);
		System.out.println("Float2 result : " + result3);
		
		Function<Integer, Integer> fun1 = Arithmetic::square;
		System.out.println(fun1.apply(3));
		
		List<Integer> list = Arrays.asList(3, 6, 1, 4, 3, 0, 8);
		Function<List<Integer>, Integer> fun2 = Arithmetic::sumList;
		System.out.println("Sume = " + fun2.apply(list));
	}
}
