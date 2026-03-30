package com.learn.java.demo.review;

import java.util.HashMap;
import java.util.Map;

public class BiConsumerExample {

	public static void main(String[] args) {
		// 1. Create and populate the Map
		Map<String, Integer> numberMap = new HashMap<>();
		numberMap.put("one", 1);
		numberMap.put("two", 2);
		numberMap.put("three", 3);
		numberMap.put("four", 4);

//		numberMap.forEach((key, value) -> {
//			System.out.println("The text '" + key + "' maps to the number: " + value);
//		});

		Map<String, String> config = System.getenv();

		// Silently processing each entry to log system details
		
		config.forEach((key, value) -> {
			if (key.contains("JAVA_HOME")) {
				System.out.println("System Config -> " + key + ": " + value);
			}
//			System.out.println(key);
		});

	}

}
