package com.generics.wildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.generics.genTypeMethConstr.DemoGen;


public class Test {

	public static void main(String[] args) {
		Collection<?> coll = new ArrayList<String>();
		//OR
		List<? extends Number> list = new ArrayList<Long>();
		//OR
		Map<String,?> pair = new HashMap<String,Integer>();
		
		//List<? extends Number> list = new ArrayList<String>();  //String is not subclass of Number; so error
		//OR
		//Comparator<? super String> cmp = new RuleBasedCollator(new Integer(100)); //String is not superclass of Integer

		//A generic type where all type arguments are the unbounded wildcard “?” without any restriction on type variables
		ArrayList<?>  list1 = new ArrayList<Long>(); 
		//or
		ArrayList<?>  list2 = new ArrayList<String>(); 
		//or
		ArrayList<?>  list3 = new ArrayList<DemoGen>();
		
		
	}

}
