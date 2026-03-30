package com.learn.java.demo.numbericStream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumbericStreamAggregateExample {

	public static void main(String[] args) {

		int sum = IntStream.rangeClosed(1, 3).sum();
		System.out.println("Sum is : " + sum);
		
		OptionalInt optionalIntMax = IntStream
				.rangeClosed(1, 5)
				.max();
		
		System.out
		.println(optionalIntMax.isPresent() 
				? optionalIntMax.getAsInt() : 0 );
		
		OptionalLong optionalLong =  LongStream.rangeClosed(50, 100).min();
	
		System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : 0);
	
		OptionalDouble optionalDouble = IntStream.rangeClosed(1, 50).average();
	
		System.out.println(optionalDouble.isPresent() ? "optionalDoubleAverage: "+optionalDouble.getAsDouble() : 0);
	}

}
