package com.learn.java.date.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : " + localDateTime);
		
		
		LocalDateTime localDateTime1 = LocalDateTime.of(2026, 04, 03, 11, 30,40);
		System.out.println("Crete instance localDateTime : " + localDateTime1);
		
		
		LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Crete instance localDateTime : " + localDateTime2);
		
		/*
		 * Getting the time and date from LocalDateTime instance
		 */
		
		System.out.println("hour : " + localDateTime.getHour());
		System.out.println("getMinute : " + localDateTime.getMinute());
		System.out.println("getDayOfMonth : " + localDateTime.getDayOfMonth());
		
		
		/*
		 * Modifying LocalDate Time
		 */
		
		System.out.println("plusHours : " + localDateTime.plusHours(2));
		System.out.println("minusDays : " + localDateTime.minusDays(2));
		System.out.println("withMonth : " + localDateTime.withMonth(12));
		
		// converting localdate, localtime to localdatetime and viceversa
		LocalDate localDate = LocalDate.of(2025, 01, 01);
		System.out.println("atTime : " + localDate.atTime(23,23));
		
		LocalTime localTime = LocalTime.of(23, 25);
		System.out.println("atDate : " + localTime.atDate(localDate));
		
		LocalDateTime localDateTime3 = localTime.atDate(localDate);
		System.out.println("toLocalDate : " + localDateTime3.toLocalDate());
		System.out.println("toLocalTime : " + localDateTime3.toLocalTime());
		
	}

}








