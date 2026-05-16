package com.lambda.java8lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {

	public static void main(String[] args) {
		List<Integer> num1 = Arrays.asList(1,2,3,4);
		List<Integer> num2 = Arrays.asList(5,6,7);
		List<Integer> num = Stream.of(num1, num2).flatMap(val -> val.stream()).collect(Collectors.toList());
		System.out.println(num);
	}

}
