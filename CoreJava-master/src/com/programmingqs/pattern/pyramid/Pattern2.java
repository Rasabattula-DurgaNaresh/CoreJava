package com.programmingqs.pattern.pyramid;

public class Pattern2 {

	public static void main(String[] args) {
		int n = 7;
		pattern1(n);
	}
	
	/**
	 * 
	 * @param n =7
	 * 		1
			123
			12345
			1234567
			12345
			123
			1
	 */
	public static void pattern1(int n) {
		System.out.println("");
		System.out.println("Pattern 1: ");
		System.out.println("");
		int nosOfCol = 1;
		
		for(int i = 0 ; i <= n ; i++) {
			for(int j = 1 ; j <= nosOfCol ; j++) {
				System.out.print(j);
			}
			System.out.println();
			if(i < n/2) {
				nosOfCol += 2;
			} else {
				nosOfCol -= 2;
			}
		}
	}
	

}
