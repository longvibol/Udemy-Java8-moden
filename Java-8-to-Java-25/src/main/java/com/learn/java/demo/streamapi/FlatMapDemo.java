package com.learn.java.demo.streamapi;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class FlatMapDemo {
	
	public static List<String> activitiesList(){
		
		return StudentDataBase.getAllStudents().stream() // Stream<Student>
			.map(Student::getActivities) // Stream<List<String>>
			.flatMap(List::stream)
			.collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {

		System.out.println(activitiesList());
		
	}

}
