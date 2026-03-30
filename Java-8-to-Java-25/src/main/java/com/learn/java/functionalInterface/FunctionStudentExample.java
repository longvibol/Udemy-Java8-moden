package com.learn.java.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class FunctionStudentExample {
	
	static Predicate<Student> p1 = student-> student.getGpa()>=3.9;
	
	static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
		
		Map<String, Double> studentGrademap = new HashMap<>();
		
		students.forEach(student ->{
			if(p1.test(student)) {
				studentGrademap.put(student.getName(), student.getGpa());
			}			
		});
		
		return studentGrademap;		
		
	});

	public static void main(String[] args) {
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

	}

}
