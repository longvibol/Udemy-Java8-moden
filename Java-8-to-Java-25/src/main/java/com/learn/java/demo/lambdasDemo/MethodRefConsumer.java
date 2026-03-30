package com.learn.java.demo.lambdasDemo;

import java.util.function.Consumer;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class MethodRefConsumer {
	
	
	// className::methodName
	static Consumer<Student> c1 = System.out::println;
	
	
	// className::instanceMethod
	static Consumer<Student> c2 = Student::printListOfStudent;
	
	public static void main(String[] args) {

		StudentDataBase.getAllStudents().forEach(c1);
		StudentDataBase.getAllStudents().forEach(c2);
		
	}

}
