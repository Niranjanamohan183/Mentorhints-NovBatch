package com.week5.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamOperations {
	
	public static void main(String[] args) {
		//List<Interger> numbers = new ArrayList<Integer>;
		
		List<Integer> numbers = Arrays. asList(99, 42,5,10,23,84,6,89, 11, 12, 0, 99);
		
		numbers.stream()
		       .filter(n -> n > 10)
		       .sorted()
		       .distinct()
		       .map(n -> n*2 )
		       .skip(4)
		       .limit(2) //
		       .forEach(System.out :: println);
		
		System.out.println(numbers);
	}

}
