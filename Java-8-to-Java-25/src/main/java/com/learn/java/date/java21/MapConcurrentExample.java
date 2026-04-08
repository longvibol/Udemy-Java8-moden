package com.learn.java.date.java21;

import java.util.stream.Stream;

public class MapConcurrentExample {

	// (Parallel mapping)
	
	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4)
	      .gather(java.util.stream.Gatherers.mapConcurrent(
	          2, // parallelism
	          x -> {
	              try { Thread.sleep(500); } catch (Exception _) {}
	              return x * 2;
	          }
	      ))
	      .forEach(System.out::println);

	}
	
	/*
	 	2
		4
		6
		8 
		
	 */

}
