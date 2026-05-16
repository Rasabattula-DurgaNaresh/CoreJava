package com.programmingqs.level1;

public class IsPrime {

	public static void main(String[] args) {
		int n = 11;
		System.out.println(isPrime(n)?n+" is a prime number.":n+" is not a prime number.");
		n = 24;
		System.out.println(isPrime(n)?n+" is a prime number.":n+" is not a prime number.");
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
			if(n%i == 0)
				return false;
			}
		return true;
		}
	}
