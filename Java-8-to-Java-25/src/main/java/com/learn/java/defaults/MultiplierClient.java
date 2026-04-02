package com.learn.java.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {
		
		// create object from Inteface then have to implemnt one of that
		Multiple multiplier = new MultiplierImpl();
		
		List<Integer> intergerList = Arrays.asList(1,3,5);
		
		System.out.println("Result is : " + multiplier.Multiplier(intergerList));
		System.out.println("default method is : " + multiplier.size(intergerList));
		System.out.println("static method is : " + Multiple.isEmpty(intergerList));

		// we can use the static method by called the Class or Interface 
	}

}
