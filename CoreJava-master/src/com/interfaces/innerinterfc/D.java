package com.interfaces.innerinterfc;

public class D {
	static void meth1() {
		
	}
	
	 private Object readResolve() {
	      return new D();
	    }
}
