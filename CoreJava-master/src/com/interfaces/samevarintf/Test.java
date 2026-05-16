package com.interfaces.samevarintf;

public class Test {

	public static void main(String[] args) {
		A a = new C();
		a.meth1();
		System.out.println(A.x);
		
		B b = new C();
		b.meth1();
		System.out.println(B.x);
		
		C c = new C();
		c.meth1();
		System.out.println(C.x);
	}

}
