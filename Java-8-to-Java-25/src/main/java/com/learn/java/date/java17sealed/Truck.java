package com.learn.java.date.java17sealed;

//public final class Truck extends Vehicle{

	public non-sealed class Truck extends Vehicle{

		@Override
		public String drive() {
			return "Truck";
		}
		
		// when we use : non-sealed = the extend class can exten from that Truck class 

}
