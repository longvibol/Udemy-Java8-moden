package com.learn.java.date.java21;

import java.util.stream.Stream;

public class WindowFixed {
	
	// (Fixed-size grouping)

	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5, 6)
        	.gather(java.util.stream.Gatherers.windowFixed(2))
        	.forEach(System.out::println);
	}
	
	/*
	Gatherers.windowFixed(2)
	
	 	[1, 2]
		[3, 4]
		[5, 6]
	
	 */
}
