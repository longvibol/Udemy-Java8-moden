package com.learn.java.demo.review;

import java.util.function.Consumer;

public class lambdasExample {

	public static void main(String[] args) {		

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello Vibol");

			}
		};
		
		r1.run();
		
		Runnable lamR1 = () -> System.out.println("Hello From Lambdas");		
		lamR1.run();
		
		
		

	}

}
