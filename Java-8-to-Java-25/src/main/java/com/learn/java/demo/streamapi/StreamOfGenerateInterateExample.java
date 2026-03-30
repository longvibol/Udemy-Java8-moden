package com.learn.java.demo.streamapi;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateInterateExample {

	public static void main(String[] args) {

		Stream<String> stringStream = Stream.of("vibol","dany","braly","bunchheng");
		stringStream.forEach(x->System.out.println(x));
		
		Stream.iterate(1, x->x*2)
			.limit(3)
			.forEach(System.out::println);
		
		Supplier<Integer> itergateInteger = new Random()::nextInt;
		
		Stream.generate(itergateInteger).limit(5).forEach(System.out::println);
		
	}

}
