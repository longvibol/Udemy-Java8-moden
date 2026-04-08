package com.learn.java.date.java17sealed;

public sealed class Car extends Vehicle permits FlyingCar {

	@Override
	public String drive() {
		
		return "Car";
	}
}
