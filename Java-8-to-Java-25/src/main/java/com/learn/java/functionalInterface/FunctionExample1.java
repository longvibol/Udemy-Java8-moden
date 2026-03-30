package com.learn.java.functionalInterface;

public class FunctionExample1 {
	
	// create reduce functon from function
	
	public static String performConcat(String str) {
		return FunctionalExample.addSomeString.apply(str);
	}

	public static void main(String[] args) {
		String result = performConcat("Hello");
		
		System.out.println("Result : " + result);

	}

}
