package com.learn.java.demo.streamapi;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class filterDemo {
	
	public static List<Student> filterStudent(){
		return StudentDataBase.getAllStudents().stream()
			.filter((student)-> student.getGender().equals("female"))
			.filter(s->s.getGpa()>=3.9)
			.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		filterStudent().forEach(System.out::println);

	}

}
