package com.learn.java.demo.streamapi;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class mapReduceExample {
	
	public static int totalNumberOfNoteBook() {
		return StudentDataBase.getAllStudents().stream() // stream<Student>
			.filter(student->student.getGradeLevel()>3)
			.filter(student ->
				student.getGender().equals("female")
			)
			.map(Student::getNoteBooks)// stream<Integer>
//			.reduce(0, (a,b)->a+b);
			.reduce(0,Integer::sum);
	}

	public static void main(String[] args) {
		
		int totalNumber = totalNumberOfNoteBook();

		System.out.println(totalNumber);
	}

}
