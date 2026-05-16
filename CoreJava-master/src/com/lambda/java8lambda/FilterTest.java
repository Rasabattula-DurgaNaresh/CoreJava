package com.lambda.java8lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FilterTest {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa1","1qqq","aacdc");
		//get string started with number
		/*	list.stream().filter(l -> isDigit(l.charAt(0))).collect(toList());*/
	/*	List<String> beginningWithNumbers
		= Stream.of("a", "1abc", "abc1").filter(value -> isDigit(value.charAt(0)))
		.collect(toList());
		assertEquals(asList("1abc"), beginningWithNumbers);*/
		
		list.stream().filter(value -> value.length() > 4).collect(Collectors.toList());
	}
}
