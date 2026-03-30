package com.learn.java.demo;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class BiPredicateExample {
	
	// BiPredicate Accep Two input parameter 
	static BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel>=3 && gpa>=3.9;
	
	// Printing Function Name And Activites
	static BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + ":" + activities);	
	
	
	// Function Combine 	
	static Consumer<Student> studentConsumer = ( student -> {
		if(biPredicate.test(student.getGradeLevel(), student.getGpa())) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	});
	
	
	// Function print list of student : list of name that have list of activities 
	public static void printNameAndActivitiess(List<Student> students) {
		students.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {

		List<Student>  studentList= StudentDataBase.getAllStudents();		
		printNameAndActivitiess(studentList);
		
	}

}
