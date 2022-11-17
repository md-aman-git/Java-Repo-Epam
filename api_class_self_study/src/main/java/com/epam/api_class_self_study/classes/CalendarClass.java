package com.epam.api_class_self_study.classes;

import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		System.out.println("Today Date : " + calendar.get(Calendar.DATE));
		System.out.println("Today Time : " + calendar.getTime());
		System.out.println("Today Year : " + calendar.get(Calendar.YEAR));
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("Date after 10 days : " + calendar.getTime());
		
		calendar.add(Calendar.MONTH, 2);
		System.out.println("Date after 2 MONTHS : " + calendar.getTime());
		
		calendar.add(Calendar.WEEK_OF_MONTH, 2);
		System.out.println("Date after 1 WEEK_OF_MONTH : " + calendar.getTime());
		
		System.out.println("Time zone = " + calendar.getTimeZone());
		
		
	}

}
