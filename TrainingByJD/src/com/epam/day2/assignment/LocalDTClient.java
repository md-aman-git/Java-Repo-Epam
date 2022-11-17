package com.epam.day2.assignment;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

import com.epam.util.MyUtil;

public class LocalDTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zId = ZoneId.of(args[0]);
//		TimeZone tz = TimeZone.getDefault();
//		System.out.println(tz);
//		System.out.println(tz.getRawOffset());
		while(true) {
			LocalDateTime ldt = MyUtil.getLatestLDT(zId);
			ldt = ldt.plusMinutes(30);
			System.out.println(ldt);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println("Exception occured : " + e.getMessage());
			}
		}
	}

}
