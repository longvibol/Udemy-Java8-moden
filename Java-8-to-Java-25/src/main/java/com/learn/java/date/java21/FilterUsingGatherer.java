package com.learn.java.date.java21;

import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class FilterUsingGatherer {
	
	// Filter using Gatherer.of

	public static void main(String[] args) {
		
		Gatherer<Integer, ?, Integer> filterEven =
			    Gatherer.of((state, element, downstream) -> {
			        if (element % 2 == 0) {
			            downstream.push(element);
			        }
			        return true;
			    });

			Stream.of(1, 2, 3, 4, 5)
			      .gather(filterEven)
			      .forEach(System.out::println);

	}
	
	/*
	 	2
		4
	 */

}
