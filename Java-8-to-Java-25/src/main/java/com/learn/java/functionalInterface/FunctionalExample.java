package com.learn.java.functionalInterface;

import java.util.function.Function;

public class FunctionalExample {

	static Function<String, String> function = (letter) -> letter.toUpperCase();
	static Function<String, String> addSomeString = (letter) -> letter.toUpperCase().concat(" default");

	public static void main(String[] args) {
		
		System.out.println("Result is : " + function.apply("java8"));
		System.out.println("Result Concat : " + function.andThen(addSomeString).apply("andThen do the parameter 1"));
		System.out.println("Result Concat : " + function.compose(addSomeString).apply("compose do the last function input 1"));

	}

}
