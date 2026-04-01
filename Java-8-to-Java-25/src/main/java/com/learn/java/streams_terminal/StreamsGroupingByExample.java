package com.learn.java.streams_terminal;

import java.text.DecimalFormat;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class StreamsGroupingByExample {
	
	
	public static int sum() {
		return StudentDataBase.getAllStudents().stream()
				.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static Double avg() {
		
		double average = StudentDataBase.getAllStudents().stream()
			.collect(Collectors.averagingDouble(Student::getNoteBooks));
		
		// Formate the result to 2 decimal places
		DecimalFormat df =  new DecimalFormat("#.##");
		return Double.valueOf(df.format(average));
	}

	public static void main(String[] args) {
		
		System.out.println("Sum of Note Books : " + sum());
		
		System.out.println("Average of Note Books : " + avg());

	}

}
