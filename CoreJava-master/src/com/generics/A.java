package com.generics;

public class A {
	public void meth1(A a) {
		System.out.println(a);
	}
}

 class B extends A {
	 public void meth1(String a) {
			System.out.println(a);
		}
}
 
 class C extends A {
	 public void meth1(Integer a) {
			System.out.println(a);
		}
}
