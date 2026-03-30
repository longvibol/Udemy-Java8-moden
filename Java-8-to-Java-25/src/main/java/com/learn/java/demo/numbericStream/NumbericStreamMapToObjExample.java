package com.learn.java.demo.numbericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.learn.java.demo.data.Student;

public class NumbericStreamMapToObjExample {
	
	public static List<String> mapToObjExample() {
	    return IntStream.rangeClosed(1, 10)
	            .mapToObj(i -> "Number: " + i)
	            .collect(Collectors.toList());
	}
	
	public static List<StudentMapToObj> createStudents() {
	    return IntStream.rangeClosed(1, 5)
	            .mapToObj(i -> new StudentMapToObj(i, "Student"))
	            .collect(Collectors.toList());
	}
	
	public static long mapToLong() {
		return IntStream.rangeClosed(1, 5)
			.mapToLong(i->i)
			.sum();
	}
	public static double mapToDouble() {
		return IntStream.rangeClosed(1, 5)
				.mapToDouble(i->i)
				.sum();
	}

	public static void main(String[] args) {

//		System.out.println("mapToObject : " + mapToObjExample());
//		System.out.println("mapToObject : " + createStudents());
//		System.out.println("mapToObject : " + mapToLong());
		System.out.println("mapToObject : " + mapToDouble());
//		mapToObjExample().forEach(System.out::println);
		
	}

}
