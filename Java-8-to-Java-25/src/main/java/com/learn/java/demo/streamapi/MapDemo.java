package com.learn.java.demo.streamapi;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class MapDemo {
	
	public static List<String> nameList(){
		
		return StudentDataBase.getAllStudents().stream() // Stream<Student>
			.map(Student::getName) // Stream<String> : map convert type from Object Student to O.String
			.map(String::toUpperCase) // Stream<String> -> uppercase operation on each input
			.collect(Collectors.toList());
		
	}
	
	public static Set<String> nameSet(){
		
		return StudentDataBase.getAllStudents().stream() // Stream<Student>
				.map(Student::getName) // Stream<String> : map convert type from Object Student to O.String
				.collect(Collectors.toSet());
		
	}

	public static void main(String[] args) {

		System.out.println(nameList());
		System.out.println(nameSet());
	}

}
