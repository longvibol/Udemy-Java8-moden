package com.learn.java.streams_terminal;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class StreamMappingExample {

	public static void main(String[] args) {
		List<String> nameList = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		System.out.println("nameList : " + nameList);
		
		Set<Double> gpa = StudentDataBase.getAllStudents().stream()
				.map(Student::getGpa)
				.collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println("Set gpa : " + gpa);
	}

}
