package com.learn.java.date.java21;

import java.util.stream.Stream;

public class FoldExample {
	
	// (Like reduce, but flexible)

	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4)
	      .gather(java.util.stream.Gatherers.fold(
	          () -> 0,                 // initial value
	          (sum, x) -> sum + x      // accumulate
	      ))
	      .forEach(System.out::println);

	}
	
	/*
	 10
	 */
}
