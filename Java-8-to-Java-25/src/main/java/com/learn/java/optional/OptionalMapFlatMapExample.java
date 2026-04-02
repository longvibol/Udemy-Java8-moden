package com.learn.java.optional;

import java.util.Optional;

import com.learn.java.demo.data.Bike;
import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class OptionalMapFlatMapExample {
	
	//filter
	public static void optinalFilter() {
		// fetch data
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); // Optional<Student>

		studentOptional.filter(student -> student.getGpa() >= 3.5).ifPresent(student -> System.out.println(student));
	}

	// map
	public static void optinalMap() {
		// fetch data
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); // Optional<Student>

		if (studentOptional.isPresent()) {
			Optional<String> stringOptional = 
					studentOptional
					.filter(student -> student.getGpa()>= 3.5)
					.map(Student::getName);
			System.out.println(stringOptional.get());
		}

	}
	
	// flatMap
		public static void optinalFlatMap() {
			// fetch data
			Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); // Optional<Student>

			if (studentOptional.isPresent()) {
				Optional<String> nameBike = 
						studentOptional
						.filter(student -> student.getGpa()>= 3.5) // Optional<Student <Optional<Bike>>
						.flatMap(Student::getBike) //Optional<Bike>
						.map(Bike::getName);
				
				nameBike.ifPresent(s -> System.out.println("Bike name : " + s));
			}

		}

	public static void main(String[] args) {
		optinalFilter();
		optinalMap();
		optinalFlatMap();
	}

}
