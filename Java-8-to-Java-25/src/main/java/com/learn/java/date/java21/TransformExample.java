package com.learn.java.date.java21;

import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class TransformExample {

	// Transform (map) using Gatherer.of
	
	public static void main(String[] args) {
		Gatherer<Integer, ?, Integer> multiplyBy10 =
			    Gatherer.of((state, element, downstream) -> {
			        downstream.push(element * 10);
			        return true;
			    });

			Stream.of(1, 2, 3)
			      .gather(multiplyBy10)
			      .forEach(System.out::println);

	}
	
	/*
		10
		20
		30
	 */

}
