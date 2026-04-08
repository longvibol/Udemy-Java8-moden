package com.learn.java.date.java15;

public class TextBlocks {
	
	public static String multipleString() {
		
		return  "This is a"
				+ " hello"
				+ " teat";		
	}
	
	public static String multipleStringV1() {
		
		return   """
				hello test with be 
				   how are you 
				""";	
	}
	
	public static String multipleStringV2(String name) {
		
		var multiple = """
				Hello, %s!
				this is a 
					multiline string
				with newlines inside
				""".formatted(name);
		
		return multiple;
	}


	public static void main(String[] args) {
				
		System.out.println("multipleString : " + multipleString());
		System.out.println("multipleString V1 : " + multipleStringV1());
		System.out.println("multipleString V2 with formate string : " + multipleStringV2("Vibol"));
		
		
	}

}
