package com.learn.java.defaults;

import java.util.List;

public class MultiplierImpl implements Multiple{


	@Override
	public int Multiplier(List<Integer> integerList) {
		
		return integerList.stream()
			.reduce(1,(x,y)-> x*y);

	}
	
	public int size(List<Integer> integerList) {
		System.out.println("Inside MultiplierImpl class");
		return integerList.size();
	}

}
