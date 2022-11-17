package com.epam.java8features.datetimefeature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeFeature {
	public void dateTimeFeateures() {
		LocalDate date = LocalDate.now();

		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println("LocalDate : " + date);
		System.out.println("LocalDateT :" + dateTime);

		LocalDate dateOf = LocalDate.of(2022,2,2);
		System.out.println("LocalDate : " + dateOf);

		LocalDateTime startOfTheDay = dateOf.atStartOfDay();
		System.out.println("LocalDate time with start of the day: " + startOfTheDay);


		ZonedDateTime zonedTime = ZonedDateTime.now();
		System.out.println("LocalDate zoned : " + zonedTime);

		ZonedDateTime zonedTimeParis = ZonedDateTime.of(dateTime, ZoneId.of("Europe/Paris"));
		System.out.println("LocalDate zoned for Paris : " + zonedTimeParis);


		LocalDate dateAfter4Days = date.plusDays(4);
		System.out.println("LocalDate after 4 days : " + dateAfter4Days);

		LocalDate dateAfter4weeks = date.plus(4, ChronoUnit.WEEKS);
		System.out.println("LocalDate after 4 weeks : " + dateAfter4weeks);
	}
}
