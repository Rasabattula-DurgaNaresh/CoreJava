package com.lambda.java8lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","hello");
		//Convert to UpperCase
		List<String> opt = list.stream().map(m -> m.toUpperCase()).collect(Collectors.toList());
		System.out.println(opt);
	}
}
