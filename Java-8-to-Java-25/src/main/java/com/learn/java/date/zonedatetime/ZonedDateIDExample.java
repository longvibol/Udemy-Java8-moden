package com.learn.java.date.zonedatetime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateIDExample {

	public static void main(String[] args) {

		//CST, EST, MST,PST
		System.out.println("Chicago CST 	: " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("Detroit EST 	: " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
		System.out.println("LA PST 		: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println("Denver CST 	: " + ZonedDateTime.now(ZoneId.of("America/Denver")));
		
		// get the time from zoneID
		
		LocalDateTime localDateTimeDetroit = LocalDateTime.now(ZoneId.of("America/Detroit"));
		System.out.println("Detroit time 	: " + localDateTimeDetroit);
		
		LocalDateTime localDateTimeDetroit1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit")));
		System.out.println("Detroit time 	: " + localDateTimeDetroit1);
		
		// create instant of from zoneid
		LocalDateTime localDateTimeDetroit2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Detroit"));
		System.out.println("ofInstant 	: " + localDateTimeDetroit2);
		
		
	}

}
