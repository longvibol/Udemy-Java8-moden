package com.learn.java.date.java9;

import java.util.List;
import java.util.Map;

import ch.qos.logback.core.helpers.Transform;

public class LocalTypeReferenceVar {

	public static void main(String[] args) {
		var list = List.of("Hello","Test");
		
		System.out.println(list);
		list.forEach(System.out::println);
		
		//Returns an unmodifiable map containing keys and values extracted from the given entries		
		var map = Map.ofEntries(Map.entry("a", List.of("adam","alex")));  // Map : {a=[adam, alex]}
		
		System.out.println("Map : " + map);
		
		for(var name : list) {
			System.out.println("var in for loop : "+name);
		}
		
		map.forEach((s, strings) -> System.out.println("s = " + s));
		
		
		// Var limitation 
		// - var cannot assign to Null
		// - var can not change the type when we already reference it 
		/*
		var a = "Hello";
		a =5; 
		*/
		
		// var in the class properties are not allowed.
		// Ex: private var x = "abc";
		
		// var can not use with function parameter 
		// Ex : public static String hello( var name ) : it can not use
		
		// var is the reserver key work can not assign to the variable 
		
		
		
		

	}

}
