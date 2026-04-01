package com.learn.java.optional;

import java.util.Optional;

import com.learn.java.demo.data.Student;

//OrElse
public class OptionalOrElseExample {

	// OrElse
	public static String optionalOrElse() {

		// Optional<Student> studentOptional =
		// Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		String name = studentOptional.map(Student::getName).orElse("Default");

		return name;
	}

	// OrElseGet
	public static String optionalOrElseGet() {

		//Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		String name = studentOptional.map(Student::getName).orElseGet(() -> "OrElseGet");
		return name;
	}
	
	// OrElseGet
		public static String optionalOrElseGetThrow() {

			//Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
			Optional<Student> studentOptional = Optional.ofNullable(null);
			String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data Available"));
			return name;
		}

	public static void main(String[] args) {
		System.out.println(optionalOrElse());
		System.out.println(optionalOrElseGet());
		System.out.println(optionalOrElseGetThrow());

	}

}
