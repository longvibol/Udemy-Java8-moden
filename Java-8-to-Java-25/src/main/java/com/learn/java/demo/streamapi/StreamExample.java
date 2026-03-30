package com.learn.java.demo.streamapi;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class StreamExample {

	public static void main(String[] args) {
		
		Predicate<Student> studentLevelGeterThan3 = s ->s.getGradeLevel()>=3;
		Predicate<Student> studentGpaThan39 = s ->s.getGpa()>=3.9;

		Map<String, List<String>> studentMapping = StudentDataBase.getAllStudents().stream()
//			.peek((student)->System.out.println("Before: "+student.getName()))
			.filter(studentLevelGeterThan3)
			.filter(studentGpaThan39)
			.peek((student)->System.out.println("After: "+student.getName()))
			
			.collect(Collectors.toMap(Student::getName,Student::getActivities));
		
		System.out.println(studentMapping);
	}

}
