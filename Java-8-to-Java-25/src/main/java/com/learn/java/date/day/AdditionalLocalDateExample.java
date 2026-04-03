package com.learn.java.date.day;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;

public class AdditionalLocalDateExample {

	public static void main(String[] args) {
		
		LocalDate localDate =LocalDate.now();		
	
		// check leap year
		System.out.println("Is this year is Leap Year : " 
				+ localDate.isLeapYear());	
		
		// Check year is Leap Year		
		System.out.println("Check Year is Leap year 2028 : " 
				+ LocalDate.ofYearDay(2028, 1).isLeapYear());	
		
	}

}
