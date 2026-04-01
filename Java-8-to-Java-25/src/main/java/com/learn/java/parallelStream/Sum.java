package com.learn.java.parallelStream;

public class Sum {

	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public void performSum(int input) {
//		total= total + input;
		total+=input;
	}
	
	// if we use parallel the result will be change all the time casue it use the get and update the result 
	// that why we can not sue parallel performance 
	
	/*
	 * So the recommendation here is that if you have any mutable variable, then do not use parallel streams
	at all
	 */

}
