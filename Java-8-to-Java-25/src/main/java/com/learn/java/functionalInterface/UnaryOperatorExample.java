package com.learn.java.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	// we use it when the input and output the same type
	static UnaryOperator<String> unaryOperator = (s) -> s.concat(" Default");

	public static void main(String[] args) {
		
		System.out.println(unaryOperator.apply("Java 8"));
		
		List<String> names = Arrays.asList("bob", "alice");
		
		names.replaceAll(name -> name.substring(0,1).toUpperCase() + name.substring(1));
		
		names.forEach(s-> System.out.println(s));

	}

}
