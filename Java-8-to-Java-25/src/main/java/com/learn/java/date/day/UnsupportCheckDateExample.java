package com.learn.java.date.day;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;

public class UnsupportCheckDateExample {

	public static void main(String[] args) {
		
		LocalDate localDate =LocalDate.now();		
		
		// Unsupported unit: Minutes : becasue localDate does not have mini
		
		try {
			System.out.println("Chronounit minus : " + localDate.minus(1, ChronoUnit.MINUTES));
		} catch (Exception e) {
			System.out.println("Unsupported unit: Minutes");
		}
		
		// check perform if the localDate support or not
		System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.YEARS));
		
	}

}
