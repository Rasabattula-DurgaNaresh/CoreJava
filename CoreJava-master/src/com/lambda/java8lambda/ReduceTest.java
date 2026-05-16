package com.lambda.java8lambda;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		int sum = num.stream().reduce(0, (x,y) -> x+y);
		System.out.println(sum);
	}

}
