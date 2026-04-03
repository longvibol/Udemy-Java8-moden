package com.learn.java.date.duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.of(7, 20);
		LocalTime localTime1 = LocalTime.of(8, 10);
		
		long diff = localTime.until(localTime1, ChronoUnit.MINUTES);
		System.out.println("Diff : " + diff);
		
		// between two time 
		Duration duration = Duration.between(localTime, localTime1);
		System.out.println("Duration : " + duration.toMinutes());
		
		//convert from hours to min
		Duration duration1 = Duration.ofHours(5);
		System.out.println("toMinutes : " + duration1.toMinutes());
		
		LocalDate localDate = LocalDate.now();
		LocalDate localDate1 = LocalDate.now().plusDays(10);
		
		Duration duration2 = Duration.between(localDate, localDate1);
		System.out.println("difference bewteen LocalDate : " + duration2);
		
	}

}
