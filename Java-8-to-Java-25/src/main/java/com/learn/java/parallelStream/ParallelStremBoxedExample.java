package com.learn.java.parallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStremBoxedExample {
	
	public static int sequentialStream(List<Integer> interList) {
		
		long start = System.currentTimeMillis();
		
		int sum =interList.stream()
			.reduce(0,(x,y)->x+y);
		
		long duration = System.currentTimeMillis() - start;
		
		System.out.println("Duration is Sequential Stream : " + duration);
		
		return sum;
	}
	
	
public static int parallelStream(List<Integer> interList) {
		
		long start = System.currentTimeMillis();
		
		int sum =interList.parallelStream()
			.reduce(0,(x,y)->x+y); // perform the unboxing from Integer to int​
		
		long duration = System.currentTimeMillis() - start;
		
		System.out.println("Duration is Parallel Stream : " + duration);
		
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> interList = IntStream.rangeClosed(1, 10000)
				.boxed()
				.collect(Collectors.toList());
		
		sequentialStream(interList);
		
		parallelStream(interList);

	}

}
