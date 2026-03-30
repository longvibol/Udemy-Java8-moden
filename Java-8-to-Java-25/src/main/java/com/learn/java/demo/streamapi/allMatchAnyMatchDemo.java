package com.learn.java.demo.streamapi;

import com.learn.java.demo.data.StudentDataBase;

public class allMatchAnyMatchDemo {
	
	public static Boolean allMatch() {
		return StudentDataBase.getAllStudents().stream()
			.allMatch(student -> student.getGpa()>=3.9);
	}
	
	public static Boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream()
			.anyMatch(student -> student.getGpa()>=4);
	}
	
	public static Boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream()
			.noneMatch(student -> student.getGpa()>=4);
	}

	public static void main(String[] args) {

		System.out.println("Result of all All Match: " + allMatch());
		System.out.println("Result of all Any Match: " + anyMatch());
		System.out.println("Result of all None Match: " + noneMatch());
		
	}

}
