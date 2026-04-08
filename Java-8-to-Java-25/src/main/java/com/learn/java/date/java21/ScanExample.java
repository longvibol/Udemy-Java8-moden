package com.learn.java.date.java21;

import java.util.stream.Stream;

public class ScanExample {

	// (Running total)
	
	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4)
	      .gather(java.util.stream.Gatherers.scan(
	          () -> 0,
	          (sum, x) -> sum + x
	      ))
	      .forEach(System.out::println);
	}

	/*
	 	1
		3
		6
		10
	 */
	
}
