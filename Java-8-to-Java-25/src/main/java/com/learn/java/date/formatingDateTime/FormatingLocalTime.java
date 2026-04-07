package com.learn.java.date.formatingDateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatingLocalTime {

	public static void parseLocalDate() {
		/*
		 * parse : convert from String to LocalTime
		 */

		String time = "16:00";
		LocalTime localtime = LocalTime.parse(time);
		System.out.println("localtime : " + localtime);
		
		LocalTime localTime1 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("localTime1 " + localTime1);
		
		String time1 = "16*00";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
		LocalTime localtime2 = LocalTime.parse(time1,dateTimeFormatter);	
		System.out.println("localtime2 : " + localtime2);
		
		String time2 = "16*00:05";
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH*mm:ss");
		LocalTime localtime3 = LocalTime.parse(time2, dateTimeFormatter1);		
		System.out.println("localtime2 : " + localtime3);

	}

	public static void formatLocalTime() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
		LocalTime formatTime = LocalTime.now();
		System.out.println("Current time now : " + formatTime);
		String formatToLocalTime = formatTime.format(dateTimeFormatter);
		System.out.println("Convert from LocalTime to String: " + formatToLocalTime);
	}

	public static void main(String[] args) {

		parseLocalDate();
		System.out.println("Format To LocalDate");
		formatLocalTime();
	}

}
