package com.learn.java.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<Student> newStudent = ()->{
			return new Student("Vibol",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball","running"));
		};
		
		System.out.println(newStudent.get());
		
		Supplier<List<Student>> listStudent = ()-> StudentDataBase.getAllStudents();
		
		System.out.println(listStudent.get());
		
	}	

}
