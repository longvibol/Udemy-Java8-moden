package com.learn.java.date.instant;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
	
	// Instant is the machine time to read

	public static void main(String[] args) {
		
		Instant instant = Instant.now();
		System.out.println("instant.now() : "+instant);
		
		// Jan 1st 1970 -> it called Epoch --> 86400 seconds (it reference zero)
		System.out.println("getEpochSecond " + instant.getEpochSecond());
		
		Instant instant1 = Instant.now();
		Duration duration = Duration.between(instant, instant1);
		System.out.println("difference : " + duration.getNano());

	}

}










