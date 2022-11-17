package com.epam.day2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
	public static void main(String[] args) {
		// Local Date

		LocalDate ld = LocalDate.of(2022, 2, 8);
		System.out.println(ld);
		// Local Time
		LocalTime lt = LocalTime.of(16, 22);
		System.out.println(lt);

		// Local Date Time
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
		ZoneId zid = ZoneId.of("Australia/Lindeman");
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zid);
		System.out.println(zdt);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-yyyy-dd");
		ld.format(dtf);
		System.out.println(ld);
	}
}
