package com.prog;

import java.util.Collections;
import java.util.LinkedList;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str1 = "abcdefg";
		String opt1 = new StringBuffer(str1).reverse().toString();
		System.out.println(str1+" reverse "+opt1);
		
		String str2 = "";
		
		// create Linked List
	      LinkedList list = new LinkedList(); 
	      
	      // populate list
	      list.add(52);  
	      list.add(27);  
	      list.add(14);  
	      list.add(-33);
	      
	      System.out.println("List before shuffle: "+list);   

	      // shuffle the list
	      Collections.shuffle(list);  
		  
	      System.out.println("List after shuffle: "+list);
	}

}
