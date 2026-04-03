package com.learn.java.date.day;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;

public class CompareDateExample {

	public static void main(String[] args) {
		
		LocalDate localDate =LocalDate.now();		
		LocalDate localDate1 = localDate.plusDays(1);
	
		System.out.println("Today is : " + localDate);
		System.out.println("Instance Date is : " + localDate1);
		
		//check localDate isEqual
		System.out.println("isEqual : " + localDate.isEqual(localDate1)); // False 
		
		//check localDate isBefore
		System.out.println("isBefore : " + localDate.isBefore(localDate1)); // True 
		
		//check localDate isAfter
		System.out.println("isAfter : " + localDate.isAfter(localDate1)); // False	
		
	}

}
