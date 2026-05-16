package com.reflection;

import java.lang.reflect.Array;

public class ChangeArraySize {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		int[] newArray =(int[]) changeArraySize(intArray,8);
		print(newArray);
		String[] str1 = {"A","B","C","D"};
		String[] str2 = (String[])changeArraySize(str1, 10);
		print(str2);
	}
	
	//change array size
	public static Object changeArraySize(Object obj, int len) {
		Class<?> arr =obj.getClass().getComponentType();
		Object newArray = Array.newInstance(arr, len);
		
		//do an array copy
		int co = Array.getLength(obj);
		System.arraycopy(obj, 0, newArray, 0, co);
		return newArray;
	}
	
	//print the object
	public static void print(Object obj) {
		Class<?> c1 = obj.getClass().getComponentType();
		Class<?> c = obj.getClass();
		if(!c.isArray()) {
			return;
		}
		System.out.println("Length of new array: "+Array.getLength(obj));
		for(int i = 0 ; i<Array.getLength(obj);i++) {
			System.out.print(Array.get(obj, i) + " ");
		}
	}
	
}
