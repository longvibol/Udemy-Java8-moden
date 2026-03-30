package com.learn.java.demo.numbericStream;

import java.util.stream.IntStream;

public class NumbericStreamRangesExample {

	public static void main(String[] args) {

		// Rang 
		IntStream rang = IntStream.range(1, 50);
		System.out.println(rang.count());
		
		IntStream.range(1, 50)
	    .forEach(value -> {
	        if (value < 49) {
	            System.out.print(value + ",");
	        } else {
	            System.out.println(value);
	        }
	    });
		
		// RangClose
		
		System.out.println("============================ RangClose");
		IntStream rangClose = IntStream.rangeClosed(1, 50);
		System.out.println(rangClose.count());
		
		IntStream.rangeClosed(1, 50)
	    .forEach(value -> {
	        if (value < 50) {
	            System.out.print(value + ",");
	        } else {
	            System.out.println(value);
	        }
	    });
		
		// Double 
		System.out.println("============================ Double");
		IntStream.rangeClosed(1, 50).asDoubleStream()
			.forEach(value -> {
		        if (value < 50) {
		            System.out.print(value + ",");
		        } else {
		            System.out.print(value);
		        }
		    });
		
		
	}

}
