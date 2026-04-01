package com.learn.java.optional;

import java.util.Optional;

public class OptionalIspresentExample {

	public static void main(String[] args) {

		//isPresent
		Optional<String> optional = Optional.ofNullable("hello Optional");
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		//ifPresent (check first is return True then it will do another step 
		optional.ifPresent(s -> System.out.println(s));
	}

}
