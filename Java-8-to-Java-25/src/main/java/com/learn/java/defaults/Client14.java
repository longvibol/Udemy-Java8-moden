package com.learn.java.defaults;

public class Client14 implements Interface1, Interface4{

	@Override
	public void methodA() {
		System.out.println("Override Method in Client14 : " + Client123.class);
	}
	
	public static void main(String[] args) {		
		
		Client14 client14 = new Client14();
		client14.methodA();
		
	}
	

}
