package com.learn.java.date.zonedatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime : " + zonedDateTime);
		
		System.out.println("getOffset : " + zonedDateTime.getOffset());
		System.out.println("getZone : " + zonedDateTime.getZone());
		
		// print avaible zoon 
//		System.out.println("ZoneId : " + ZoneId.getAvailableZoneIds());
		
//		ZoneId.getAvailableZoneIds().stream()
//        	.filter(z -> z.contains("America"))
////        	.limit(10)
//        	.forEach(System.out::println);
		
		//System.out.println("No of Zones : " + ZoneId.getAvailableZoneIds().size());
		
	}

}
