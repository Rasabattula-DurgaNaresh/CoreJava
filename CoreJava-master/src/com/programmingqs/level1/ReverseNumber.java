package com.programmingqs.level1;

public class ReverseNumber {

	public static void main(String[] args) {
		int i =123456;
		System.out.println("Original Number: "+i);
		reverseNumber(i);
	}
	
	public static void reverseNumber(int num) {
		int remainder, reverse = 0;
		while(num > 0) {
			remainder = num%10;
			num= num/10;
			reverse = reverse*10+remainder;
		}
		System.out.println("Reverse number: "+reverse);
	}
}
