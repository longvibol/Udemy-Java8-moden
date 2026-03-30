package com.learn.java.streams_terminal;

import java.util.stream.Collectors;

import com.learn.java.demo.data.StudentDataBase;

public class StreamCountingExample {
	
	public static Long countingStudent() {
		return StudentDataBase.getAllStudents().stream()
			.collect(Collectors.counting());
	}
	
	public static Long countingGpa() {
		return StudentDataBase.getAllStudents().stream()
				.filter(s->s.getGpa()>=3.9)
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {

		System.out.println("Counting Student : " + countingStudent());
		System.out.println("Counting GPA >= 3.9 : " + countingGpa());
	}

}
