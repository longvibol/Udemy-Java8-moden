package com.learn.java.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.java.demo.data.Student;
import com.learn.java.demo.data.StudentDataBase;

public class StreamsPartitioningExample {
	
	public static void partitionalBy1() {
        // Predicate to check if GPA is >= 3.8
        Predicate<Student> gpaPredicate = st -> st.getGpa() >= 3.8;

        // Partitioning the students based on the GPA condition
        Map<Boolean, List<String>> result = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(
                        gpaPredicate,  // The condition to partition by GPA
                        Collectors.mapping(Student::getName, Collectors.toList())  // Collecting student names into a list
                ));

        // Printing the result
        System.out.println(result);
    }
	
	public static void partitionalBy2() {
       
        Predicate<Student> gpaPredicate = st -> st.getGpa() >= 3.8;

        Map<Boolean, Set<Student>> result = StudentDataBase.getAllStudents()
        		.stream()
                .collect(Collectors.partitioningBy(
                        gpaPredicate, Collectors.toSet()  
                        ) 
                );
                
        System.out.println(result);
    }

	public static void main(String[] args) {
//		partitionalBy1();
		
		partitionalBy2();
	}

}
