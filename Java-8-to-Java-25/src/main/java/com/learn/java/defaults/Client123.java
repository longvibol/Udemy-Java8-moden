package com.learn.java.defaults;

public class Client123 implements Interface1,Interface2,Interface3{
	
	public void methodA() {
		System.out.println("Inside Method A " + Client123.class);
	}

	public static void main(String[] args) {		

		
		Client123 client123 = new Client123();
		
		client123.methodA(); // The result will take the overide from parent class or interface
		
		/*
		 * Interface1 have Method A
		 * In Interface2 have Overide Method A 
		 */
		
//		client123.methodB();
//		client123.methodC();

	}

}
