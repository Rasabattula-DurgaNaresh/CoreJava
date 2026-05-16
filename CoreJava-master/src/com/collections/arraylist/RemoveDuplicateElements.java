package com.collections.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List<String>al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("b");
		al.add("e");
		System.out.println(al);
		
		//START type1: use hashset but order is not maintained
		System.out.println("use hashset but order is not maintained");
		HashSet<String> hs = new HashSet<String>(al);
		//we are using copy constructor both are referencing to different mem location as String (Immutable obj is used)
		System.out.println("Same memory locations: "+al.equals(hs));
		al.clear();
		al.addAll(hs);
		System.out.println("use hashset order is not maintained"+al);
		
		System.out.println("*******************************");
		System.out.println("type2: use linkhashset order is also maintained");
		//START type2: use linkhashset order is also maintained
		List al1 = new ArrayList();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(1);
		al1.add(4);
		System.out.println(al1);
		Set lhs = new LinkedHashSet(al1);
		//we are using copy constructor both are referencing to different mem location as primitive is used
		System.out.println("Same memory locations: "+al1.equals(lhs));
		al1.clear();
		al1.addAll(lhs);
		System.out.println("use linkedhashset order is maintained"+al1);
		
		System.out.println("*******************************");
		//If we copy constructor of same collection type 
		Employee e1 = new Employee("AA");
		Employee e2 = new Employee("BB");
		Employee e3 = new Employee("AA");
		Employee e4 = new Employee("CC");
		
		List<Employee> ale = new ArrayList<Employee>();
		ale.add(e1);
		ale.add(e2);
		ale.add(e3);
		ale.add(e4);
		Set<Employee> lhse = new LinkedHashSet<Employee>(ale);
		System.out.println("Same memory locations AL to LinkedHashSet: "+ale.equals(lhse));
		List<Employee> ale1 = new LinkedList<Employee>(ale);
		System.out.println("Same memory locations AL to AL: "+ale.equals(ale1));
		
		System.out.println("*******************************");
		
		
	}

}
