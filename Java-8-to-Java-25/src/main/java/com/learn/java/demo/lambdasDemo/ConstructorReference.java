package com.learn.java.demo.lambdasDemo;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import com.learn.java.demo.data.Student;

public class ConstructorReference {
	
	static Supplier<Student> studentSupplier = Student::new;
	static Function<String,Student> studentFunction = Student::new;

	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentFunction
				.apply("Vibol"));
	}

}
