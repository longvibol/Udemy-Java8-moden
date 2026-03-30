package com.learn.java.demo.review;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {	
		
		Predicate<String> isLongerThan5 = s -> s.length() > 5;
		Predicate<String> containsLetterA = s -> s.contains("a");

		// Combine them: must be longer than 5 AND contain "a"
		Predicate<String> combined = isLongerThan5.and(containsLetterA);

		System.out.println(combined.test("Keycloak")); // true
		System.out.println(combined.test("Java"));     // false (too short)		
	}
}