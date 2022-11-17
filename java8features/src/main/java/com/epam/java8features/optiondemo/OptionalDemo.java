package com.epam.java8features.optiondemo;

import java.util.Optional;

public class OptionalDemo {
	public void optionalDemoMethod() {
		Double db1 = null;
		Double db2 = new Double(11);
		Double db3 = new Double(15);
		
		Optional<Double> option1 = Optional.ofNullable(db2);
		//Optional<Double> option2 = Optional.of(db1); //this will throw an exception because b1 is null and of() does not allow null.
		System.out.println("isPresent : " + option1.isPresent());
		System.out.println("isPresent : " + option1.orElse(db3));//if db2 will be null then db3 else db2 option.
	}
}
