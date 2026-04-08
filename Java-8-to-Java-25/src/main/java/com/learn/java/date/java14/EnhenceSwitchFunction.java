package com.learn.java.date.java14;

import java.time.Month;
import java.time.Year;

public class EnhenceSwitchFunction {
	
	 public static int getDays(Month month, int year) {
	        int noOfDays = 0;
	        switch (month) {
	            case SEPTEMBER:
	            case APRIL:
	            case JUNE:
	            case NOVEMBER:
	                noOfDays = 30;
	                //return noOfDays;
	                break;
	            case FEBRUARY: // this is a code block;
	                System.out.println("Checking if " + year + " is a leap year");
	                noOfDays = Year.isLeap(year) ? 29 : 28;
	                //  return noOfDays;
	                break;

	            default:
	                noOfDays = 31;
	        }
	        return noOfDays;

	    }
	 // Enhenace Switch
	 public static int getDaysV2(Month month, int year) {
		 return switch (month) {
		 case SEPTEMBER,APRIL,JUNE,NOVEMBER -> 30;
		 case FEBRUARY -> Year.isLeap(year) ? 29 : 28;
		 default ->31;
		 };
	 }
	 
	 // Enhenace Switch with yield
	 public static int getDaysV3(Month month, int year) {
		 return switch (month) {
		 case SEPTEMBER,APRIL,JUNE,NOVEMBER -> 30;
		 case FEBRUARY -> {
			 System.out.println("Check if year is = " + year + " is a leap year ? ");
			 yield Year.isLeap(year) ? 29 : 28;
		 }
		 default ->31;
		 };
	 }
	 
	 // Remove default when it all the condition are cover
	 public static int getDaysV4(Month month, int year) {
	        return switch (month){
	            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> 30;
	            //case FEBRUARY -> Year.isLeap(year) ? 29 : 28;
	            case FEBRUARY -> {
	                System.out.println("Check if year is = " + year + " is a leap year ?");
	                yield Year.isLeap(year) ? 29 : 28;
	            }
	            //default -> 31;
	            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
	        };
	    }

	public static void main(String[] args) {
		
		int days = getDays(Month.APRIL, 2026);		
		System.out.println(days);
		
		int daysV2 = getDaysV2(Month.FEBRUARY, 2026);		
		System.out.println(daysV2);
		
		int getDaysV3 = getDaysV3(Month.FEBRUARY, 2026);		
		System.out.println(getDaysV3);

	}

}















