package com.learn.java.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {
	
	public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes) {
		
		long startTime = System.currentTimeMillis();
		
		for(int i =0 ; i<numberOfTimes;i++) {
			supplier.get();
		}
		
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
	
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 10000)
			.sum();
	}
	
	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 100000)
			.parallel()  // split the data in to multiple parts 
			.sum();
	}

	public static void main(String[] args) {
		
		//check proceesor 
		System.out.println("Number of processor : "+Runtime.getRuntime().availableProcessors());
		
		long checkPerformanceSequentialResult = checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20);
		
		System.out.println("Sequential Strem Result : " + checkPerformanceSequentialResult);
		System.out.println("Parallel Stream Result : " + checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));
		
		// checkPerformanceResult : is the Method in the class (Supplier<Integer> supplier, int numberOfTimes)
		// supplier : () -> return ==> sumParallelStream() ==> ParallelStreamExample::sumParallelStream 
		// numberOfTimes
		
	}

}
