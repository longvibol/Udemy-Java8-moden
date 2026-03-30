package com.learn.java.demo.streamapi;

import java.util.Optional;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class findAnyDemo {
	
	public static Optional<Student> findAnyStudent(){
		return StudentDataBase.getAllStudents().stream()
			.filter(student -> student.getGpa()>=3.9)
			.findAny();
	}
	
	public static Optional<Student> findFirstStudent(){
		return StudentDataBase.getAllStudents().stream()
			.filter(student -> student.getGpa()>=3.9)
			.findFirst();
	}

	public static void main(String[] args) {
		Optional<Student> studentOptionalFindAny = findAnyStudent();
		
		Optional<Student> studentOptionalFindFirst = findFirstStudent();
		
		String result = studentOptionalFindAny
			    .map(student->{
			    	return "Name : " + student.getName() + " And have gpa : " + student.getGpa();
			    })
			    .orElse("Student not found!");
		System.out.println(result);
		
		String result1 = studentOptionalFindFirst
			    .map(student->{
			    	return "Name : " + student.getName() + " And have gpa : " + student.getGpa();
			    })
			    .orElse("Student not found!");
		System.out.println(result1);
		
		
		/*
		if(studentOptionalFindAny.isPresent()) {
			System.out.println("Found the student : " + studentOptionalFindAny.get().getGpa());
		}else {
			System.out.println("Student not found!");
		}
		*/

	}

}
