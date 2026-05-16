package com.programmingqs.pattern.pyramid;

/**
 * 
 * @author hp

 */

public class Pattern1 {

	public static void main(String[] args) {
		int n = 5;
		pattern1(n);
		
		pattern2(n);
		
		pattern3(n);
		
		pattern4(n);
	}
	
	/**
	 * 	*
	 * 	**
	 * 	***
	 * 	****
	 * 	*****
	 */
	public static void pattern1(int n) {
		System.out.println("");
		System.out.println("Pattern 1: ");
		System.out.println("");
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	/**
	 * 	*****
	 * 	****
	 * 	***
	 * 	**
	 * 	*
	 */
	public static void pattern2(int n) {
		System.out.println("");
		System.out.println("Pattern 2: ");
		System.out.println("");
		for(int i = 1 ; i <= n ; i++) {
			for(int j = i ; j <= n ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	/**
	 *	    *
		   **
		  ***
		 ****
		*****
	 * 
	 */
	public static void pattern3(int n) {
		System.out.println("");
		System.out.println("Pattern 3: ");
		System.out.println("");
		for(int i = 1 ; i <= n ; i++) {
			/*for(int s = 1 ; s <= n-i ; s++) {
				System.out.print("#");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}*/
			
			for(int j = 1 ; j <= n ; j++) {
				if(j <= (n-i)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
				
			}
			System.out.println("");
		}
	}
	
	/**
	 * 		*****
			 ****
			  ***
			   **
			    *
	 */
	public static void pattern4(int n) {
		System.out.println("");
		System.out.println("Pattern 4: ");
		System.out.println("");
		for(int i = 5 ; i > 0 ; i--) {
			/*for(int s = 1 ; s < i ; s++) {
				System.out.print("#");
			}
			for(int j = i ; j <= n ; j++) {
				System.out.print("*");
			}*/
			
			for(int j = 1 ; j <= n ; j++) {
				if(j <= (n-i)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
