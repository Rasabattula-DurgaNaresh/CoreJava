package com.interfaces.innerinterfc;

import java.util.ArrayList;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		
		A a = new A(1,2);
		List<String> list = new ArrayList<String>();
		list.add("a");
	//	Collections c = new Collections() ;
		
		D d = new D();
	//	Arrays a = new Arrays();
		
		AA aa = new CC();
		aa.meth1();
		
		
	}
}
