package com.learn.java.date.day;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;

public class ModifyLocalDateExample {

	public static void main(String[] args) {
		
		LocalDate localDate =LocalDate.now();		
	
		System.out.println("plusDays : " + localDate.plusDays(2));
		System.out.println("plusYears : " + localDate.plusYears(2));
		System.out.println("plusYears : " + localDate.minusYears(6));
		
		// using ChronoFiled
		System.out.println("ChronoField.YEAR : " 
				+ localDate.with(ChronoField.YEAR, 2020));
		
		// using TemporalAdjusters
		System.out.println("TemporalAdjusters.firstDayOfNextMonth() : " 
				+ localDate.with(TemporalAdjusters.firstDayOfNextMonth()));		
		
		// using minus
		
		System.out.println("Using minus with substraction value : " 
				+ localDate.minus(1,ChronoUnit.YEARS));	
		
	}

}
