package com.learn.java.date.java21;

import java.util.stream.Stream;

public class SlidingWindow {
	
	// (Sliding window)

	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5)
	     	.gather(java.util.stream.Gatherers.windowSliding(3))
	     	.forEach(System.out::println);

	}
	
	/*
	 Gatherers.windowSliding(3)
	 	[1, 2, 3]
		[2, 3, 4]
		[3, 4, 5]
		
	 */

}
