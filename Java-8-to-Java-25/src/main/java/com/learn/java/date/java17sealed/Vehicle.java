package com.learn.java.date.java17sealed;

public sealed abstract class Vehicle permits Car, Truck{
	
	public abstract String drive();
	
	// when we use "abstract" keyword mean the extends class need to implement that method

}
