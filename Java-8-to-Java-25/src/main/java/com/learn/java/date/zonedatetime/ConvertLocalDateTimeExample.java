package com.learn.java.date.zonedatetime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ConvertLocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : "+localDateTime);
		
		// add the localDateTime to the have localDateTime and Zone 
		ZonedDateTime zonedDateTimeAddZone = localDateTime.atZone(ZoneId.of("Asia/Bangkok"));
		System.out.println("Add ZoneID : " + zonedDateTimeAddZone);  //2026-04-03T16:38:48.694173400+07:00[Asia/Bangkok]
		
		ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Bangkok"));
		System.out.println("zonedDateTime : " +zonedDateTime);
		
		//add offsetDateTime
		OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(-6));
		System.out.println("offsetDateTime : " + offsetDateTime);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
