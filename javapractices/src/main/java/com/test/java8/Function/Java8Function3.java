package com.test.java8.Function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/*3.1 This example accepts Function as an argument, convert a List into a Map.*/

public class Java8Function3 {

	public static void main(String[] args) {
		
		Java8Function3 obj = new Java8Function3();
		List <String> list = Arrays.asList("Pritam","Keshav", "Madhav" , "Krishna");
		
		// Lambda
		Map <String , Integer > map = obj.convertListToMap(list,  x -> x.length());
		System.out.println(map);

		// Method reference
		Map <String , Integer > mapMethod = obj.convertListToMap(list,  obj :: getLength);
		System.out.println(mapMethod);
	}
	private <T , R> Map <T , R> convertListToMap (List<T> ls ,Function <T , R> func){

		Map <T , R > result = new HashMap<>();
		for (T t : ls) {
			result.put(t, func.apply(t));
		}
		return result;
	}
	
	 public Integer getLength(String str) {
	        return str.length();
	    }

}
