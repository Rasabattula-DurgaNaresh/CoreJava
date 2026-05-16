package com.lambda.javarev;

import java.util.Arrays;
import java.util.List;

public class MRTest {

	public static void main(String[] args) {
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		double total = 0;
		// Without lambda expressions:
		for (Integer cost : costBeforeTax)
		{ 
			double price = cost + .12*cost; System.out.println(price); 
			total = total + price;
		}
		
		// With Lambda expression:
		costBeforeTax.stream().map(c -> c + .12 * c).forEach(System.out::println);
		
		// New way:
		double bill = costBeforeTax.stream().map(c -> c + .12 * c).reduce((sum,cst) -> sum+cst).get();
		System.out.println("Bill : "+ bill);
	}

}
