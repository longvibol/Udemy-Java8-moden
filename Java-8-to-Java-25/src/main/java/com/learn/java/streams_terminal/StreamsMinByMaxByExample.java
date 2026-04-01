package com.learn.java.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class StreamsMinByMaxByExample {
	
	public static void groupStudentByGender(){
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
			.collect(Collectors.groupingBy(Student::getGender));
		
		System.out.println(studentMap);
		 
	}	
	
	public static void groupStudentByGenderName() {
	    Map<String, List<String>> collect = StudentDataBase.getAllStudents().stream()
	            .collect(Collectors.groupingBy(
	                    Student::getGender, 
	                    Collectors.mapping(Student::getName, Collectors.toList())
	            ));
	    System.out.println(collect);        
	}
	
	
	public static void customizedGroupBy() {
		    Map<String, List<String>> collect = StudentDataBase.getAllStudents()
		            .stream()
		            .collect(Collectors.groupingBy(
		                    student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE",
		                    Collectors.mapping(Student::getName, Collectors.toList())
		            ));
	    
	    System.out.println(collect);        
	}
	
	public static void customizedGroupBy1() {
	    Map<String, Set<String>> collect = StudentDataBase.getAllStudents()
	            .stream()
	            .collect(Collectors.groupingBy(student->
	            student.getName(), Collectors.mapping(Student::getGender, Collectors.toSet())
	            		));
    
    System.out.println(collect);        
}

	public static void main(String[] args) {
//		groupStudentByGender();
		
//		groupStudentByGenderName();
		customizedGroupBy();
	}

}
