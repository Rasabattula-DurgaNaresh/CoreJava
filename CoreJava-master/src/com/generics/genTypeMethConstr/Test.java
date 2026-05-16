package com.generics.genTypeMethConstr;

import java.util.Arrays;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		String[] a = {"aa","bb","cc","dd","cc"};
		Integer [] b = {1,2,3,4,5,6,5,4,5};
		System.out.println(DemoGen.countAllOccurrences(a ,"cc"));
		
		System.out.println(DemoGen.countAllOccurrences(a ,2));
		
		System.out.println(DemoGen.countAllOccurrences(b, 2));
		
		System.out.println(DemoGen.countAllOccurrences(b, "aa"));
		
		//compiler error
	//	Dimension<Integer> i = new Dimension<Integer>(1, "a", 2);
		
		Dimension<Integer> i1 = new Dimension<Integer>(1, 3, 2);
		
		System.out.println(countAllOccurrences(Arrays.asList("aa","bb","cc","dd","cc"), "cc"));
		
		System.out.println(countAllOccurrences(Arrays.asList("aa","bb","cc","dd","cc"), 2));
		
		List<String> list = Arrays.asList("aa","bb","cc","dd","cc");
		
		System.out.println(countAllOccurrences(list, "cc"));
		
		//Compiler error 
		//The method countAllOccurrences(List<T>, T) in the type Test is not applicable for the arguments (List<String>, int)
		//System.out.println(countAllOccurrences(list, 3));
	}

	public static <T> int countAllOccurrences(List<T> list, T item) {
		int count = 0 ;
		if (item == null) {
		      for ( T listItem : list )
		         if (listItem == null)
		            count++;
		   }
		   else {
		      for ( T listItem : list )
		         if (item.equals(listItem))
		            count++;
		   }
		   return count;
	}
}
