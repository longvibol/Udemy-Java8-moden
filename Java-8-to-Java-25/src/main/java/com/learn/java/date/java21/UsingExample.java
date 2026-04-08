package com.learn.java.date.java21;

import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class UsingExample {

	
	//Using Gatherer.ofSequential (Stateful example)
	
	public static void main(String[] args) {
		
		Gatherer<Integer, ?, Double> runningAverage =
			    Gatherer.ofSequential(
			        () -> new int[]{0, 0}, // [sum, count]
			        (state, element, downstream) -> {
			            state[0] += element;
			            state[1] += 1;
			            downstream.push((double) state[0] / state[1]);
			            return true;
			        }
			    );

			Stream.of(2, 4, 6, 8)
			      .gather(runningAverage)
			      .forEach(System.out::println);

	}

	/*
	 	2.0
		3.0
		4.0
		5.0
	 */
}
