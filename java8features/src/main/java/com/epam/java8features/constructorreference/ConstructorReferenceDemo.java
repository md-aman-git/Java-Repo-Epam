package com.epam.java8features.constructorreference;

import java.util.function.BiFunction;

public class ConstructorReferenceDemo {
	public void demoMethod() {
		//Operation operation = Addition::new;
		
		BiFunction<Integer, Integer, Addition> f1 = Addition::new;
		BiFunction<Integer, Integer, Addition> f2 = (a, b) -> new Addition(a, b);
		
		System.out.println("call 1 : " + f1.apply(4, 5).getValue());
		
		System.out.println("call 2 : " + f2.apply(9, 7).getValue());
		
	}
}
