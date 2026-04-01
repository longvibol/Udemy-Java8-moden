package com.learn.java.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class StreamsGroupByTwoLevelmapping {
	
	
	public static void twoLevelGrouping_1() {
	    Map<Integer, Map<String, List<String>>> collect = StudentDataBase.getAllStudents()
	            .stream()
	            .collect(Collectors.groupingBy(
	                    Student::getGradeLevel, // First level: Group by grade level
	                    Collectors.groupingBy(
	                            student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE", // Second level: Group by GPA
	                            Collectors.mapping(Student::getName, Collectors.toList()) // Collect names into a list
	                    )
	            ));

	    System.out.println(collect);
	}
	
	public static void twoLevelGrouping_2() {
	    Map<String, Integer> collect = StudentDataBase.getAllStudents()
	            .stream()
	            .collect(Collectors.groupingBy(
	            		student -> "Level: " + student.getGradeLevel() +" ", 
	                    Collectors.summingInt(
	                            Student::getGradeLevel)
	            ));

	    System.out.println(collect);
	}
	
	public static void twoLevelGrouping_3() {
	    Map<String, Integer> collect = StudentDataBase.getAllStudents()
	            .stream()
	            .collect(Collectors.groupingBy(
	            		student -> student.getName(), 
	                    Collectors.summingInt(
	                            Student::getGradeLevel)
	            ));

	    System.out.println(collect);
	}

	public static void main(String[] args) {
		
//		twoLevelGrouping_1();
//		twoLevelGrouping_2();
		twoLevelGrouping_3();

	}

}
