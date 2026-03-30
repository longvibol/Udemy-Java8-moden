package com.learn.java.demo.streamapi;

import java.lang.classfile.ClassFile.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduceDemo {
	
	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream()
			//1
			//3
			//5
			//7
			// a =1, b=1 from stream ==> result 1 is return
			// a =1, b=3 from stream ==> result 3 is return
			// a =3, b=5 from stream ==> result 15 is return
			// a =15, b=7 from stream ==> result 105 is return
			.reduce(1,(a,b)->a*b);
	}
	
	public static Optional<Integer> performMultiplicationOptional(List<Integer> integerList) {
		return integerList.stream()
			.reduce((a,b)->a*b);
	}

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1,3,5,7);
		List<Integer> integers1 = new ArrayList<>();
		
		int multipleOne = performMultiplication(integers);
		System.out.println(multipleOne);
		
		Integer integerWithoutInitailValue = performMultiplicationOptional(integers).get();
		System.out.println(integerWithoutInitailValue);
		
		Optional<Integer> result = performMultiplicationOptional(integers1);
		
		if(result.isPresent()) {
			System.out.println(result.get());
		}
				
	}

}
