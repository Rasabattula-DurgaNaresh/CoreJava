package com.prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestCode {
	public static StringBuffer getRev(String str) {
		StringBuffer sb = new StringBuffer();
		char[] stringToCharArray ; 
		String[] splitString = str.split("[\\s]+");
		for(String str1 : splitString) {
			System.out.println(str1);
		}
		 return sb;
	}
	
	public static void shuffle(char[] stringToCharArray, StringBuffer sb, List<Character> list) {
		for(Character c: stringToCharArray) {
			list.add(c);
		}
		Collections.shuffle(list);
		for(Character c: list) {
			sb.append(c);
		}
	}
	public static void main(String[] args) {
		String str = "Hello, world! How are you?";
		StringBuffer sb = getRev(str);
		System.out.println(str);
		System.out.println(sb);
	}
}