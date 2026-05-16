package com.programmingqs.pattern.pyramid;

public class Pattern3 {

	public static void main(String[] args) {
		int n = 5;
		pattern1(n);
		pattern2(n);
		pattern3(n);
		pattern4(n);
		pattern5(n);
		pattern6(n);
	}
	
	/**
	 * 
	 * @param n
	 *  1
		12
		123
		1234
		12345

	 */
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
	
	/**
	 * 
	 * @param n = 5
	 *  1
		22
		333
		4444
		55555
	 */
	public static void pattern2(int n) {
		System.out.println("");
		System.out.println("Pattern 2: ");
		System.out.println("");
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param n
	 *  1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15 
	 */
	public static void pattern3(int n) {
		System.out.println("");
		System.out.println("Pattern 3: ");
		System.out.println("");
		
		int num = 1;
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print((num<0)?num+"  ":num+" ");
				num++;
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param n
	 *  A 
		B C 
		D E F 
		G H I J 
		K L M N O 
	 */
	public static void pattern4(int n) {
		System.out.println("");
		System.out.println("Pattern 4: ");
		System.out.println("");
		int num = 65;
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print((char)num+" ");
				num++;
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param n
	 *  A 
		B B 
		C C C 
		D D D D 
		E E E E E 
	 */
	public static void pattern5(int n) {
		System.out.println("");
		System.out.println("Pattern 5: ");
		System.out.println("");
		int num = 65;
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print((char)num+" ");
			}
			num++;
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param n
	 *  a 
		b b 
		c c c 
		d d d d 
		e e e e e 
	 */
	public static void pattern6(int n) {
		System.out.println("");
		System.out.println("Pattern 6: ");
		System.out.println("");
		int num = 97;
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print((char)num+" ");
			}
			num++;
			System.out.println();
		}
	}
}
