package com.learn.java.date.time;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
	
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : " + localTime);
		
		LocalTime localTime1 = LocalTime.of(23, 33);
		System.out.println("Create Instance localTime1 : " + localTime1);
		
		LocalTime localTime2 = LocalTime.of(23, 33, 40);
		System.out.println("Create Instance localTime2 with min : " + localTime2);
		
		LocalTime localTime3 = LocalTime.of(23, 33, 40 , 98876767);
		System.out.println("Create Instance localTime3 min and nanoSecond : " + localTime3);

	}

}
