package com.test.java8.Function;

import java.util.function.Function;

/*2.1 This example chains the Function with andThen().*/

public class Java8Function2 {

	public static void main(String[] args) {
		
		
		Function<String , Integer> function1 = x -> x.length();
		Function<Integer , Integer> function2 = x -> x*2;
		Integer output = function1.andThen(function2).apply("Pritam Gupta");
		System.out.println(output);
	}
}
