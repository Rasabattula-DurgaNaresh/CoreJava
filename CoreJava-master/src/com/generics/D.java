package com.generics;

public class D {
	public void meth2(Object o) {
		System.out.println(o);
	}
}

 class E extends D {
	public void meth2(String o) {
		System.out.println(o);
	}
}
