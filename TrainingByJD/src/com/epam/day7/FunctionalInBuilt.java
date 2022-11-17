package com.epam.day7;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInBuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test with integer
		Predicate<Integer> lesserThan = i -> (i < 18);
		System.out.println(lesserThan.test(10));
		
		//test with string
		Predicate<String> strCheck = str -> (str.equalsIgnoreCase("Hello"));
		System.out.println("Hello : " + strCheck.test("Other"));
		
		//and & test
		Predicate<Integer> lesserthanTen = i -> (i < 10);
		Predicate<Integer> greaterThanFive = i -> (i > 5);
		boolean result = greaterThanFive.and(lesserthanTen).test(11);
		System.out.println(result);
		
		//supplier
		Supplier<Double> PI = () -> Math.PI;
		System.out.println(PI.get());
		
		//supplier to get epoch value
		Supplier<Long> epochValue = () -> {
			LocalDateTime ldt = LocalDateTime.now(); 
			ZoneId zid = ZoneId.of("Asia/Kolkata");
			ZoneOffset offset = ldt.atZone(zid).getOffset();
			return ldt.toEpochSecond(offset);
		};
		System.out.println(epochValue.get());
		
		//Consumer
		Consumer<String> consume = (param) -> {
			param = param.toUpperCase();
			System.out.println(param);
		};
		consume.accept("Aman");
	}

}
