package com.learn.java.demo.review;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionExample {

	public static void main(String[] args) {
		
		// T is String, R is Integer
        Function<String, Integer> stringLength = str -> str.length();

        Integer result = stringLength.apply("Hello Gemini");
//        System.out.println(result); // Output: 12
        
        
        
        UnaryOperator<Integer> multipleByTwo = x -> x*2;
        UnaryOperator<Integer> addThree = x -> x + 3;        
        
        Integer andThenAfter = multipleByTwo.andThen(addThree).apply(2);
        System.out.println(andThenAfter); // result = 7
        
        Integer composeBefore = multipleByTwo.compose(addThree).apply(2);
        System.out.println(composeBefore); // result = 10     
	}

}
