package com.programmingqs.pattern.pyramid;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 5;
		pattern1(n);
	}
	
	public static void pattern1(int n) {
		System.out.println("");
		System.out.println("Pattern 1: ");
		System.out.println("");
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}
