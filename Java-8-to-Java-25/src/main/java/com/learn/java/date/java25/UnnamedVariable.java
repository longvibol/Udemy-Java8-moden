package com.learn.java.date.java25;

public class UnnamedVariable {
	
	private static Integer getInteger(String s) {
		try {
			return Integer.parseInt(s);
		}catch (Exception e) {
			System.out.println("Failed to parse: " + e);
			return null;
		}
	}
	
	private static Integer getIntegerJava25(String s) {
		try {
			return Integer.parseInt(s);
		}catch (Exception _) {
			System.out.println("Failed to parse: " + s);
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		
		Integer integer = getInteger("Hello");
		System.out.println(integer);
		
	}
	

}
