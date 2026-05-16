package com.programmingqs.level1;

public class FibonacciSeries {
	public static void main(String [] args) {
		int n = 10;
		generateFibonacciSeries(n);
	}
	
	public static void generateFibonacciSeries(int n) {
		int first = 0;
		int second = 1;
		int temp;
		System.out.print(first+" "+second+" ");
		for(int i = 0 ; i < n ; i++) {
			temp = first+second;
			first = second;
			second = temp;
			System.out.print(temp+" ");
		}
	}
}
