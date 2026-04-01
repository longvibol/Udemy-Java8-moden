package com.learn.java.streams_terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class StreamsGroupByThreeLevelmapping {
	
	
	public static void threeLevelGrouping() {
        // Three-level grouping using groupingBy and mapping
        Map<String, List<String>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getName, // First level grouping by student name
                        LinkedHashMap::new, // Maintain insertion order using LinkedHashMap
                        Collectors.mapping(
                                Student::getName, // Mapping student name to list
                                Collectors.toList() // Collect as a list of names
                        )
                ));

        System.out.println(collect);
    }
	
	public static void calculateTopGpa() {
		Map<Integer,Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
			.stream()
			.collect(Collectors.groupingBy(Student::getGradeLevel,
					Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		
		System.out.println(studentMapOptional);
	}
	
	
	public static void calculateTopGpaWithOptional() {
        Map<Integer, String> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel, // Grouping by grade level
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Student::getGpa)), // Max GPA comparator
                                optionalStudent -> optionalStudent.map(Student::getName).orElse("No student") // Safely extract name from Optional
                        )
                ));

        System.out.println(studentMapOptional);
    }
	
	public static void calculateTopGpaWithOptionalMin() {
        Map<Integer, String> studentMapOptional = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel, // Grouping by grade level
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparing(Student::getGpa)), // Max GPA comparator
                                optionalStudent -> optionalStudent.map(Student::getName).orElse("No student") // Safely extract name from Optional
                        )
                ));

        System.out.println(studentMapOptional);
    }
	
	public static void main(String[] args) {
		
//		calculateTopGpa();
		calculateTopGpaWithOptional();
		calculateTopGpaWithOptionalMin();

	}

}
