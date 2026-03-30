package com.learn.java.demo.streamapi;

import java.lang.classfile.ClassFile.Option;
import java.util.Optional;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class reduceDemo2 {
	
	public static Optional<Student> getHighestGpaStudent(){
		return StudentDataBase.getAllStudents().stream()
			.reduce((s1,s2)-> s1.getGpa()>s2.getGpa() ? s1 : s2);
	}

	public static void main(String[] args) {

		Optional<Student> hightStuendGpaOptional = getHighestGpaStudent();
		if(hightStuendGpaOptional.isPresent()) {
			System.out.println(hightStuendGpaOptional.get().getName() + 
					"have GPA = "+hightStuendGpaOptional.get().getGpa());
		}
		
	}

}
