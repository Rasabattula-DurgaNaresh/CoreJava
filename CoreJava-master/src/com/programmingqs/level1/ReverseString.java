package com.programmingqs.level1;

public class ReverseString {

	public static void main(String[] args) {
		String str = "abcde";
		System.out.println("Original String: "+str);
		reverseStringWithoutSB(str);
		reverseStringWithSB(str);
		str = "fghi";
		System.out.println("Original String: "+str);
		reverseStringWithoutSB(str);
		reverseStringWithSB(str);
	}

	public static void reverseStringWithoutSB(String str) {
		char [] cstr = str.toCharArray();
		char temp;
		for(int i = 0, j = cstr.length-1 ; i < cstr.length/2 ; i++, j--) {
			temp = cstr[i];
			cstr[i] = cstr[j];
			cstr[j] = temp;
		}
		System.out.println("Reversed String without SB: "+new String(cstr));
	}
	
	public static void reverseStringWithSB(String str) {
		StringBuffer sb  = new StringBuffer(str);
		System.out.println("Reversed String with SB: "+sb.reverse());
	}
}
