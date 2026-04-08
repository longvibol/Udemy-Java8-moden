package com.vibol.basic.Java8.to.Java._5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

import com.learn.java.date.java17sealed.Car;
import com.learn.java.date.java17sealed.Truck;
import com.learn.java.date.java17sealed.Vehicle;

public class VehicleTest {
	
	@Test
	void VehicleTest() {
		
		var car = new Car();
		var truck = new Truck();
		
		assertInstanceOf(Vehicle.class, car);
		assertInstanceOf(Vehicle.class, truck);
		
	}
	
	@Test
	void drive() {
		
		var car = new Car();
		var truck = new Truck();
		
		assertInstanceOf(Vehicle.class, car);
		assertInstanceOf(Vehicle.class, truck);
		
		assertEquals("Car", car.drive());
		assertEquals("Truck", truck.drive());
		
	}

}
