package com.learn.java.date.day;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class ValueLocalDateExample {

	public static void main(String[] args) {
		
		/*
		 * Get Values from localDate
		 */
		System.out.println("Get Values from localDate : ");
		LocalDate localDate =LocalDate.now();
		
		System.out.println("getMonth : " + localDate.getMonth());
		System.out.println("getMonthValue : " + localDate.getMonthValue());
		System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
		System.out.println("getDayOfYear : " + localDate.getDayOfYear());
		
		// Difference way to get Date/Time
		
		System.out.println("Day of Month using get : " + 
				localDate.get(ChronoField.DAY_OF_MONTH));
				
		
	}

}
