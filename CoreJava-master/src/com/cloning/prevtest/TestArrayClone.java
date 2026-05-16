package com.cloning.prevtest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class TestArrayClone {
	public static void main(String[] args) throws CloneNotSupportedException {
/*		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("aaa");
		l1.add("bbb");
		l1.add("ccc");
		ArrayList<String> l2 = new ArrayList<String>();
	//	for(Integer i:
		 Collections.copy(Arrays.asList(l2), Arrays.asList(l1));
		 System.out.println("l1"+l1);
		 System.out.println("l2"+l2);
*/		
		//For string it is deep copy both memory localtions are seperate
		ArrayList<String> al = new ArrayList<String>();
	     //Adding elements to the ArrayList
		System.out.println("For Array List of String");
	     al.add("Apple");
	     al.add("Orange");
	     al.add("Mango");
	     al.add("Grapes");
	     System.out.println("Original ArrayList: "+al);
	     ArrayList<String> al2 = (ArrayList<String>)al.clone();
	     System.out.println("After al.clone al2 value: "+ al2);
	     //add and remove on original ArrayList
	     al.add("Fig");
	     al.remove("Orange");
	     System.out.println("After change of original ArrayList: "+ al);
	     System.out.println("al2 value ArrayList: doesnot change "+ al2);
	     
	     System.out.println("**************************************");
	     
	     System.out.println("For Array List of Employee Object");
	   //For mutable objects its always shallow cloning evn if Object implements clone
	     Employee e = new Employee("Aaa");
	     ArrayList<Employee> ale = new ArrayList<Employee>();
	     ale.add(e);
	     System.out.println("Original AL: "+ale.get(0).getName());
	     
	     ArrayList<Employee> ale1 = (ArrayList<Employee>)ale.clone();
	     System.out.println("Copy AL "+ale1.get(0).getName());
	     
	     ale.get(0).setName("BBB");
	     System.out.println("Original AL after changing name "+ale.get(0).getName());
	     System.out.println("Copy AL after changing name of Original "+ale1.get(0).getName());
		 
	     System.out.println("**************************************");
	     // As Emloyee implements clonable I it is deep cloning
	     System.out.println("For Employee Object which implements clone");
	     Employee e1 = (Employee) e.clone();
	     System.out.println("Original emp name "+e.getName());
	     e.setName("cCC");
	     System.out.println("Original emp name after name change "+e.getName());
	     System.out.println("Copy emp name after name change of original "+e1.getName());
	     
	     System.out.println("**************************************");
	     System.out.println("deep cloning Collection in Java ");

	     System.out.println("**************************************");
	     System.out.println("Using Copy constructor we always obtain shallow copy of mutable object");
	    Collection<Employee> org = new HashSet<Employee>(); 
		org.add(new Employee("Joe")); 
		org.add(new Employee("Tim")); 
		org.add(new Employee("Frank")); 
		
		// creating copy of Collection using copy constructor 
		Collection<Employee> copy = new HashSet<>(org); 
		System.out.println("Original Collection {}"+ org); 
		System.out.println("Copy of Collection {}"+ copy ); 
		System.out.println("Same mem locations: "+org.equals(copy));
		
		 System.out.println("**************************************");
	     System.out.println("Using deep cloning on collection using copy1.add((Employee) iterator.next().clone())");
		// deep Cloning List in Java
		Collection<Employee> copy1 = new HashSet<Employee>(org.size()); 
		Iterator<Employee> iterator = org.iterator();
		while(iterator.hasNext())
		{ copy1.add((Employee) iterator.next().clone()); }

		System.out.println("Original Collection after modification {}"+ org); 
		System.out.println("Copy of Collection without modification {}"+ copy1 );
		System.out.println("Same mem location: "+org.equals(copy1));
		
	/*	ArrayList<String> al = new ArrayList<String>();

	     //Adding elements to the ArrayList
	     al.add("Apple");
	     al.add("Orange");
	     al.add("Mango");
	     al.add("Grapes");*/
	     
	   /*  for(String s: al) {
	    	 al.clear();
	    	 System.out.println(al);
	     }*/
	     
	    /* Iterator itr = al.iterator();
	     while(itr.hasNext()) {
	    	 String s=(String)itr.next();
	    	 if(s=="Mango")
	    	 itr.remove();
	    //	 al.add("RRR");
	    	 System.out.println(al);
	     }*/
	}
}
