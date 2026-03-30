package com.learn.java.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class BiFunctionExample {
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentPredicate)->{
		
		Map<String, Double> studentGraMap = new HashMap();
		
		students.forEach(student->{
			if(studentPredicate.test(student)) {
				studentGraMap.put(student.getName(), student.getGpa());
			}
		});
		
		return studentGraMap;
	});

	public static void main(String[] args) {
		Predicate<Student> p1 = student -> student.getGpa()>=3;
		
		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), p1));

	}

}
