package com.learn.java.demo.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxWithReduce {
	
	public static int findMaxvalue1(List<Integer> integerList) {
		return integerList.stream()
			// x = 0 and y = 1 = a[1] = 1 then x = 1
			// x = 1 and y = 2 = a[2] = 2 then x = 2
			// x = 2 and y = 3 = a[3] = 3 then x = 3
			.reduce(0,(x,y)-> x>y ? x:y);
	}
	
	public static Optional<Integer> findMaxvalueOptional(List<Integer> integerList) {
		return integerList.stream()
			.reduce((a,b)-> a>b ? a:b);			
	}
	
	public static int findMaxvalue(List<Integer> integerList) {
		return integerList.stream()
			.reduce((a,b)-> a>b ? a:b)
			.orElseThrow(() -> new RuntimeException("List is empty"));
	}
	
	public static int findMinValue(List<Integer> integerList) {
	    return integerList.stream()
	        .min(Integer::compareTo)
	        .orElseThrow(() -> new RuntimeException("List is empty"));
	}

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1,2,3,4,5);
		List<Integer> integerListOptional = new ArrayList<>();
		
		int maxvalue = findMaxvalue1(integerList);
		System.out.println("Maximum: " + maxvalue);
		
		int minValue = findMinValue(integerList);
		System.out.println("Mininum: " + minValue);
		
		
		Optional<Integer> maxValueOptional = findMaxvalueOptional(integerList);
		if(maxValueOptional.isPresent()) {
			System.out.println("Maximum Optional is : " + maxValueOptional.get());
		}else {
			System.out.println("Input list is empty");
		}
	}

}
