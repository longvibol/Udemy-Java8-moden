package com.learn.java.date.time;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ModifiyTheLocalTime {

	public static void main(String[] args) {
	
		LocalTime localTime = LocalTime.now();
		
		System.out.println("minusHours : " + localTime.minusHours(2));
		System.out.println("minusHours with ChronoUnit.HOURS : " + localTime.minus(2, ChronoUnit.HOURS));
		
		System.out.println("MIDNIGHT Time : " + localTime.with(LocalTime.MIDNIGHT));			
		
		//Minus days
		System.out.println("Modify HOUR_OF_DAY : " 
				+ localTime.with(ChronoField.HOUR_OF_DAY, 22));
		
		//Plus Minutes
		System.out.println("plusMinutes : " 
				+ localTime.plusMinutes(30));
		
		//change time 
		System.out.println("plusMinutes : " 
				+ localTime.withHour(10));
		
		
		
	}

}






















