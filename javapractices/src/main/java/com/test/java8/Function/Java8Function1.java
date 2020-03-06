package com.test.java8.Function;

import java.util.function.Function;

/*1.1 This example takes a <T> String and returns the length of the string as <R> Integer.*/

public class Java8Function1 {

	public static void main(String[] args) {
		
		/*
		 * In Java 8, Function is a functional interface;It has R apply (T t) method, which takes an argument (object
		 * of type T) and returns an object (object of type R). The argument and output
		 * can be a different type.
		 */
		
		Function<String , Integer> function = x -> x.length();
		Integer output = function.apply("Pritam");
		System.out.println(output);
	}
}
