package com.learn.java.streams_terminal;

import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class StreamsJoiningExample {
	
	// .joining = connection string
	public static String joining_1() {
		return StudentDataBase.getAllStudents().stream()
			.map(Student::getName)
			.collect(Collectors.joining());
	}
	
	public static String joining_2() {
		return StudentDataBase.getAllStudents().stream()
			.map(Student::getName)
			.collect(Collectors.joining("-"));
	}
	
	public static String joining_3() {
		return StudentDataBase.getAllStudents().stream()
			.map(Student::getName)
			.collect(Collectors.joining("-","(",")"));
	}

	public static void main(String[] args) {

		System.out.println("Joining_01 : " + joining_1());
		System.out.println("Joining_02 : " + joining_2());
		System.out.println("Joining_03 with prefix and subfix : " + joining_3());
	}

}
