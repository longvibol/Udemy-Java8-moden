package com.learn.java.demo.lambdasDemo;

import java.util.function.Function;

public class LambdasExpressionExample {
	
	
	
	static Function<String, String> toUpper = String::toUpperCase;
	static Function<String, String> toUpper1 = s->s.toUpperCase();

	public static void main(String[] args) {
		System.out.println(toUpper.apply("vibol"));

	}

}
