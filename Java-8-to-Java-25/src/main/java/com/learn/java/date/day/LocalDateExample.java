package com.learn.java.date.day;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateExample {

	public static void main(String[] args) {

		//LocalDate
		LocalDate localDate = LocalDate.now();		
		System.out.println("localDate : " + localDate);
		
		// Create instance of LocalDate
		LocalDate localDate1 = LocalDate.of(2026, 4, 04);
		System.out.println("localDate instance : " + localDate1);
		
		LocalDate localDate2 = LocalDate.ofYearDay(2027, 54);
		System.out.println("localDate instance ofYearDay : " + localDate2);
		
		
		/*
		 * Get Values from localDate
		 */
		
		System.out.println("getMonth : " + localDate.getMonth());
		System.out.println("getMonthValue : " + localDate.getMonthValue());
		System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
		System.out.println("getDayOfYear : " + localDate.getDayOfYear());
		
		// Difference way to get Date/Time
		
		System.out.println("Day of Month using get : " + 
				localDate.get(ChronoField.DAY_OF_MONTH));
				
		
	}

}
