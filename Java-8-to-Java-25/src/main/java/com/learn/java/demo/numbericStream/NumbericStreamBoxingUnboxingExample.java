package com.learn.java.demo.numbericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbericStreamBoxingUnboxingExample {
	
	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 5)
			.boxed()
			.collect(Collectors.toList());
	}
	
	public static int unBoxing(List<Integer> integerList) {
		return integerList.stream()
			.mapToInt(Integer::intValue)
			.sum();		
	}

	public static void main(String[] args) {

		// boxing().forEach(System.out::println);
		System.out.println("Boxing : " + boxing());
		
		List<Integer> integerList = boxing();
		int unBoxingSum = unBoxing(integerList);
		
		System.out.println("Sum : " + unBoxingSum);
	}

}
