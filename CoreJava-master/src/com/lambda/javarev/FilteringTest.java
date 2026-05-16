package com.lambda.javarev;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc","" , "bcd","" , "defg", "jk");
		// Create a List with String more than 2 characters
		list.stream().filter(l -> l.length() > 2).forEach(System.out::println);
		List<String> lst = list.stream().filter(l -> l.length() > 2).collect(Collectors.toList());
		System.out.println(lst);
		
		// Convert String to Uppercase and join them using coma 
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		String con = G7.stream().map( c -> c.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(con);
		
		// Create List of square of all distinct numbers 
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> num = numbers.stream().map(n -> n*n).distinct().collect(Collectors.toList());
		System.out.println(num);
	}

}
