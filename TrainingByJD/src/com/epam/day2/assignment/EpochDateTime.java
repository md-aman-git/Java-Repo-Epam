package com.epam.day2.assignment;

import java.time.LocalDateTime;
import java.time.ZoneId;
import com.epam.util.MyUtil;

public class EpochDateTime {

	public static void main(String[] args) {
		//EpochToLocal
		ZoneId zId = ZoneId.of("Asia/Kolkata");
		LocalDateTime ldt = MyUtil.epochToLocal(1644339466, zId);
		System.out.println("Local Zone Time : " + ldt);
		
		//LocalToEpoch
		LocalDateTime ldt2 = LocalDateTime.now();
		long epoch = MyUtil.localToEpoch(ldt2);
		System.out.println("Epoch Seconds : " + epoch);
	}

}
