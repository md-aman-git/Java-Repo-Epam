package com.epam.day6;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int value = Integer.parseInt(null);
			System.out.println(value);
		} catch(NumberFormatException ex) {
			System.out.println("Number format exception");
		}
		
		//Date time
		try {
			ZoneId z = ZoneId.of("");
			LocalDateTime ldt = LocalDateTime.now(z);
			System.out.println(ldt);
		} catch(DateTimeException ex) {
			System.out.println("Date time exception");
		}
		//
		try {
			LocalDateTime ld = LocalDateTime.now();
			System.out.println(ld);
			//if parsed as blank string will throw exception
			LocalDateTime ldt = LocalDateTime.parse("2022-02-14T16:01:18");
			System.out.println(ldt);
		} catch(DateTimeParseException ex) {
			System.out.println("Date time parse exception");
		}
	}

}
