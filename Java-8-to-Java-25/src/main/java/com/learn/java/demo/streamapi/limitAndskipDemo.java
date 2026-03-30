package com.learn.java.demo.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class limitAndskipDemo {
	
	public static Optional<Integer> limit(List<Integer> integers){
		return integers.stream()
			.limit(2) // take 6 and 7
			.reduce((x,y)->x+y);
	}
	
	public static Optional<Integer> skip(List<Integer> integers){
		return integers.stream()
			.skip(3) // skip 6,7,8 take 9 and 10
			.reduce((x,y)->x+y);
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(6,7,8,9,10);
		
		Optional<Integer> limit = limit(integers);
		if(limit.isPresent()) {
			System.out.println("The limit result is: " + limit.get());
		}else {
			System.out.println("No input is passed");
		}
		
		Optional<Integer> skip = skip(integers);
		if(limit.isPresent()) {
			System.out.println("The skip result is: " + skip.get());
		}else {
			System.out.println("No input is passed");
		}
	}

}
