package com.epam.util;

import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.TimeZone;

public final class MyUtil {
	public static Boolean isPalindrome(String str) {
		str = str.toLowerCase();
		int size = str.length();
		for(int i = 0; i < size / 2; i++) {
			if(str.charAt(i) != str.charAt(size - i - 1)) {
				return false;
			}
		}
		return true;
	}
	public static LocalDateTime getLatestLDT(ZoneId zId) {
		LocalDateTime ldt = LocalDateTime.now(zId);
		return ldt;
	}
	public static LocalDateTime epochToLocal(long epoch, ZoneId zId) {
		TimeZone tz = TimeZone.getTimeZone(zId);
		int milliOffsetFromGMT = tz.getRawOffset();
		LocalDateTime firstDay = LocalDateTime.of(1970, 1, 1, 0, 0, 0);		
		LocalDateTime ldtGMT = firstDay.plusSeconds(epoch);
		LocalDateTime ldtZone = ldtGMT.plusSeconds(milliOffsetFromGMT / 1000);
//		System.out.println(tz);
//		System.out.println(milliOffsetFromGMT);
//		System.out.println(firstDay);
		System.out.println("GMT Time : " + ldtGMT);
		return ldtZone;
	}
	public static long localToEpoch(LocalDateTime ldt) {
		OffsetTime off = OffsetTime.now();
		ZoneOffset offset = off.getOffset();
		long epoch = ldt.toEpochSecond(offset);
		return epoch;
	}
//	public <T> ArrayList<T> addAllObjects() {
//		ArrayList<T> list = new ArrayList<>();
//		for()
//	}
}
