package com.learn.java.demo.lambdasDemo;

import java.util.function.Predicate;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class RefactoreMethodReferenceExample {
	
	static Predicate<Student> p1 = s -> s.getGradeLevel()>=3;
	
	public static boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel()>=3;
	}

	public static void main(String[] args) {

		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
	}

}
