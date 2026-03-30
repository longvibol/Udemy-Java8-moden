package com.learn.java.demo.review;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {

		List<String> names = List.of("Alice", "Bob", "Charlie");

		Consumer<String> printNames = (name) -> System.out.println(name);

//		names.forEach(printNames);

		Consumer<String> toUpperCast = (u) -> System.out.println(u.toUpperCase());
		Consumer<String> toLowerCast = (l) -> System.out.println(l.toLowerCase());

		toUpperCast.accept("vibollong");
		toLowerCast.andThen(toUpperCast).accept("and then chaining function");

		IntConsumer number = (in) -> System.out.println("Result of input multiple by 30 is = " + in * 30);
		number.accept(20);

		BiConsumer<String, Integer> textNumberKey = (text, num) -> System.out.println();

	}

}
