package com.programmingqs.level1;

public class Factorial {

	public static void main(String[] args) {
		int n = 4;
		System.out.println("Factorial of "+n+" is "+factorial(n));
	}
	
	public static int factorial(int n) {
		int fact =1;
		while(n > 0) {
			fact *= n;
			n--;
		}
		return fact;
	}

}
