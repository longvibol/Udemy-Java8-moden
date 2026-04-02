package com.learn.java.defaults;

public interface Interface2 extends Interface1{
	
	default void methodB() {
		System.out.println("Inside Method B ");
	}
	
	// Overide Method from parent Interface1
	
	default void methodA() {
		System.out.println("Inside Method A " + Interface2.class);
	}
}
