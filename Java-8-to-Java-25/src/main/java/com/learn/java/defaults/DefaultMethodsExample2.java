package com.learn.java.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class DefaultMethodsExample2 {
	
	//Create print from Consumer
	public static Consumer<Student> studentConsumer = (student ->System.out.println(student));	
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGradeLevel);
	
	//Create functin to sort by name from student list
	public static void sortByName(List<Student> studentList) {
	
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		
		studentList.sort(nameComparator);
		
		studentList.stream()
//			.map(Student::getName)			
			.forEach(studentConsumer);
	}
	
	//Create functin to sort by name from student list
		public static void sortByGpa(List<Student> studentList) {
		
			Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
			
			studentList.sort(nameComparator);
			
			studentList.stream()
//				.map(Student::getGpa)			
				.forEach(s->System.out.println(s));
		}
		
		
		// compare multiple with compare chin
		public static void comparatorChaining(List<Student> studentList) {
			studentList.sort(gradeComparator.thenComparing(nameComparator));
			
			studentList.forEach(studentConsumer);
		}
		
		public static void sortWithNullValue(List<Student> studentList) {
			Comparator<Student> studentComparetor = Comparator.nullsLast(nameComparator);
			
			studentList.sort(studentComparetor);
			studentList.forEach(studentConsumer);
		}

		public static void main(String[] args) {
		List<Student> studentList = StudentDataBase.getAllStudents();	
		
		/*
		studentList.stream()
			.map(Student::getName)			
			.forEach(studentConsumer);	
		*/		
//		sortByName(studentList);
		
//		sortByGpa(studentList);
		
//		comparatorChaining(studentList);
		
		sortWithNullValue(studentList);

	}

}
