package com.learn.java.functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	
	static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

	public static void main(String[] args) {

		BinaryOperator<Integer> multiple = (a,b) -> a*b;
		
		System.out.println(multiple.apply(2, 4));
		
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println("Result of MaxBay is : " + maxBy.apply(4, 5));
		
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println("Result of MinBay is : " + minBy.apply(4, 5));
		
	}

}
