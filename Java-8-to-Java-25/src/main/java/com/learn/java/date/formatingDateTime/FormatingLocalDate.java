package com.learn.java.date.formatingDateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatingLocalDate {
	
	public static void parseLocalDate() {
		/*
		 * parse : convert from String to LocalDateTime
		 */
		
		String date = "2026-04-05";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("localDate : " + localDate);
		
		LocalDate localDate1 = LocalDate.parse(date,DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localDate1 : " + localDate1);
		
		
		String date1 = "20260405";
		LocalDate localDate2 = LocalDate.parse(date1,DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("localDate2 : " + localDate2);
		
		String date2 = "2026|04|05";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");		
		LocalDate localDate3 = LocalDate.parse(date2,dateTimeFormatter);
		System.out.println("localDate3 : " + localDate3);
		
		String date3 = "2026*04*05";
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM*dd");		
		LocalDate localDate4 = LocalDate.parse(date3,dateTimeFormatter1);
		System.out.println("localDate4 : " + localDate4);
		
		// if format have # we can not parse because it is the reserve keyword
		
	}
	
	public static void formatLocalDate() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");	
		LocalDate formatDate = LocalDate.now();
		String formatToLocalDate = formatDate.format(dateTimeFormatter);
		System.out.println("Convert from LocalDate to String: " + formatToLocalDate);
	}

	public static void main(String[] args) {

		parseLocalDate();
		System.out.println("Format To LocalDate");
		formatLocalDate();
	}

}
