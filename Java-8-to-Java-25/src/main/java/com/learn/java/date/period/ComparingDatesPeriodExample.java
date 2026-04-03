package com.learn.java.date.period;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ComparingDatesPeriodExample {

	public static void main(String[] args) {

		//Period
		
		LocalDate localDate = LocalDate.of(2025, 01, 01);
		LocalDate localDate1 = LocalDate.of(2026, 12, 31);
		
		Period period = localDate.until(localDate1);
		System.out.println("getDays : " + period.getDays()); // results is 30 -> performs 31-1
		System.out.println("getMonths : " + period.getMonths()); // results is 11 -> performs 12-1
		System.out.println("getYears : " + period.getYears()); // results is 1 -> performs 2026 - 2025
		
		Period period1 = Period.ofDays(10);
		System.out.println("period1.getDays : " + period1.getDays());
		
		Period period2 = Period.ofYears(10);
		System.out.println("period1.getDays : " + period2.getYears());
		System.out.println("toTotalMonths : " + period2.toTotalMonths());

		Period period3 = Period.between(localDate, localDate1);
		System.out.println("Period : " + period3.getYears() + ":" + period3.getMonths()+":" + period3.getDays()+" PM");
		
		
	}

}
