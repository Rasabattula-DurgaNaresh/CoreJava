package com.programmingqs.level1;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 12345;
		System.out.println("Sum of digits of "+n+" is "+sumOfDigits(n));
	}
	
	public static int sumOfDigits(int n) {
		int remainder, sum = 0;
		
		while(n > 0) {
			remainder = n%10;
			n = n/10;
			sum += remainder;
		}
		return sum;
	}
}
