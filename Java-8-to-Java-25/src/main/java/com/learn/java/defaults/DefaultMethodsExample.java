package com.learn.java.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("Adam","Jenny","Alex","Dan","Mike","Eric");
		
		/*
		// using Collections.Sort()
		Collections.sort(stringList);
		System.out.println("Sorted list using Collections.Sort() : " + stringList);
		*/
		
		
		//in the list it also have sort : Comparator.naturalOrder() 		
		stringList.sort(Comparator.naturalOrder());
		System.out.println("Sorted list using List.Sort() A->Z : " + stringList);
		
		//in the list it also have sort : Comparator.revers 		
		stringList.sort(Comparator.reverseOrder());
		System.out.println("Sorted list using List.Sort() Z->A : " + stringList);

	}

}
