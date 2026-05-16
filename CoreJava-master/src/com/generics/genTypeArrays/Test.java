package com.generics.genTypeArrays;

/**
 * 
 * @author pardeshi_n
 *Another reason why arrays does not support generics is that arrays are co-variant, 
 *which means that an array of supertype references is a supertype of an array of subtype references.
 * That is, Object[] is a supertype of String[] 
 * and a string array can be accessed through a reference variable of type Object[].
 */
public class Test {

	public static void main(String[] args) {
		Object[] array = new String[10];
		array[0] = "lokesh";
		//Get runtime exception java.lang.ArrayStoreException:
	//	array[1] = 10; 
		
		Object[] objArr = new String[10];  // fine
		objArr[0] = new String();
	//	objArr[1] = 10;
	}

}
