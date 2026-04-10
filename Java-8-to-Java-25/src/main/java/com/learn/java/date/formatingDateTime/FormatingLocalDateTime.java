package com.learn.java.date.formatingDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatingLocalDateTime {
	
	public static void parseLocalDateTime() {
		/*
		 * parse : convert from String to LocalDateTime
		 */
		
		String datetTime = "2026-04-05T14:30:50";
		
		LocalDateTime localDateTime = LocalDateTime.parse(datetTime);
		System.out.println("datetTime : " + localDateTime);
		
		LocalDateTime localDateTime2 = LocalDateTime.parse(datetTime, 
				DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("localDateTime2 " + localDateTime2);
		
		/*
		 * custom format 
		 */
		
		String dateTime1 = "2026-04-05T14|30|50";
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
		LocalDateTime localDateTime3 = LocalDateTime.parse(dateTime1, dateTimeFormat);
		System.out.println("localDateTime3 : " + localDateTime3);
		
		String dateTime2 = "2026-04-05abc14|30|50";
		DateTimeFormatter dateTimeFormat1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
		LocalDateTime localDateTime4 = LocalDateTime.parse(dateTime2, dateTimeFormat1);
		System.out.println("localDateTime4 : " + localDateTime4);
		
	}
	
	public static void formatLocalDateTime() {

		// We want format
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
		LocalDateTime localDateTime = LocalDateTime.now();
		String convertDatetime = localDateTime.format(dateTimeFormat);
		System.out.println("convertDatetime " + convertDatetime);
		
	}

	public static void main(String[] args) {

		parseLocalDateTime();
		System.out.println("Format To LocalDateTime");
		formatLocalDateTime();
	}

}
