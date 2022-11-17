package com.epam.day7;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = new String[3];
		names[0] = "Aman";
		names[1] = null;
		names[2] = "";
		if(names[1] != null) {
			names[1] = names[1].toLowerCase();
		}
		System.out.println(Arrays.toString(names));
		
		Optional<String> options = Optional.ofNullable(names[1]);//name[1] = null
		if(options.isPresent()) {
			String str = options.get();
			System.out.println("Value is present in options : " + str);
		}
		Optional<String> options2 = Optional.ofNullable(names[0]);//name[0] = "Aman";
		if(options2.isPresent()) {
			String str = options2.get();
			System.out.println("Value is present in options2 : " + str);
		}
		Optional<String> options3 = Optional.ofNullable(names[2]);//name[2] = "";
		if(options3.isPresent()) {
			String str = options3.get();
			System.out.println("Value is present in options3 : " + str);
		}
		System.out.println("options has some value then value is : " + options.orElse("Test"));
		System.out.println("options2 has some value then value is : " + options2.orElse("Test"));
	}

}
