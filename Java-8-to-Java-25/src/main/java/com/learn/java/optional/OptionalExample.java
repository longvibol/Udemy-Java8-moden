package com.learn.java.optional;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class OptionalExample {
	
	
	// print name of the student Map<String,Integer>
	public static void studentNameLength() {
	    Map<String, Integer> collect = StudentDataBase.getAllStudents().stream()
	        .collect(Collectors.toMap(Student::getName, student -> student.getName().length()));
	    
	    System.out.println(collect);
	}
	
	
	// using string
	public static String getStudentName() {
//		Student student = StudentDataBase.studentSupplier.get();
		Student student = null;		
		if(student!=null) {
			return student.getName();
		}else {
			return null;
		}
	}
	
	// using optional 
	
	public static Optional<String> getStudentNameOptional(){
//		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		
		Optional<Student> studentOptional = Optional.ofNullable(null);
		
		if(studentOptional.isPresent()) {
			return studentOptional.map(Student::getName);
		}
		return Optional.empty();
		
	}

	public static void main(String[] args) {
		/*
		String name = getStudentName();
		
		if(name!=null)
			System.out.println("Length of the student Name : " + name.length());
		else 
			System.out.println("Name not found");
		*/
		
		Optional<String> studentOptional = getStudentNameOptional();
		
		// find lenght of the student name
		
		if(studentOptional.isPresent()) {
			System.out.println("Length of the student Name : " + studentOptional.get().length());
		}else {
			System.out.println("Name not found !");
		}
		
	}

}
