package com.learn.java.demo.review;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample1 {

	public static void main(String[] args) {	
		List<String> names = List.of("Spring", "Java", "OAuth2", "Keycloak");
		
		// A Predicate that checks if a string starts with "S"		
		Predicate<String> checkContainS = (s) -> s.contains("S");
		
		List<String> sNames = names.stream()
			.filter(checkContainS)
			.collect(Collectors.toList());		
		System.out.println(sNames);
	}
}
