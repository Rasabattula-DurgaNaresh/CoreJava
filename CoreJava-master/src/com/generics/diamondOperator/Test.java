package com.generics.diamondOperator;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author pardeshi_n
 *Before java 7, while using generics you had to supply type parameters to variables types and to their actual types. 
 *Now, it has been relieved a bit in this new java 7 feature, 
 *and a blank diamond on right side of declaration will work fine.
 *Compiler is smart enough in java 7 to identify that blank diamond infer to type defined on left hand side of declaration.
 */
public class Test {

	public static void main(String[] args) {
		 @SuppressWarnings("unused")
	        Map<String , Integer> params = new HashMap<>();
	}

}
