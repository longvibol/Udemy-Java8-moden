package com.learn.java.demo.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TooManyListenersException;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class SortDemo {
	
	public static List<Student> sortByName(){
		
	return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());			
	}	
	
	public static List<Student> sortByGpa(){
		
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());		
	}	
	
	public static List<Student> sortByGpaRevers(){
		
		return StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());		
	}	
	
	public static void main(String[] args) {

		System.out.println("================Sort By Name=================");
		sortByName().forEach(student->System.out.println(student));
		
		System.out.println("================Sort By Gpa=================");
		sortByGpa().forEach(student->System.out.println(student));
		
		System.out.println("================Sort By Gpa Reverse=================");
		sortByGpaRevers().forEach(student->System.out.println(student));
		
	}

}
