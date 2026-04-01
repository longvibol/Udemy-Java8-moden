package com.learn.java.parallelStream;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class ParallelStreamExample1 {
	
	public static List<String> sequentialPrintStudentActities(){
		long startTime = System.currentTimeMillis();
		
		List<String> studentActivities = StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Duration to execute the pipeline is sequential : " + duration);
		
		return studentActivities;
	}
	
	
	public static List<String> parallelPrintStudentActities(){
		long startTime = System.currentTimeMillis();
		
		List<String> studentActivities = StudentDataBase.getAllStudents()
				.stream()
				.parallel()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Duration to execute the pipeline is parallel : " + duration);
		
		return studentActivities;
	}

	public static void main(String[] args) {
		sequentialPrintStudentActities();
		parallelPrintStudentActities();

	}

}
