package com.programmingqs.level1;

public class IsBinaryNumber {

	public static void main(String[] args) {
		int n = 1100210;
		System.out.println(isBinaryNumber(n)?n+" is a binary number.":n+" is not a binary number.");
		n = 110010;
		System.out.println(isBinaryNumber(n)?n+" is a binary number.":n+" is not a binary number.");
	}
	
	public static boolean isBinaryNumber(int n) {
		while(n != 0) {
			if(n%10 > 1)
				return false;
			n = n/10;
		}
		return true;
	}

}
