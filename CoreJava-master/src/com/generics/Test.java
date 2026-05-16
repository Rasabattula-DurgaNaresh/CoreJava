package com.generics;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		//The method meth1(A) in the type A is not applicable for the arguments (String)
		//a.meth1("Hi A");
		
		B b = new B();
		b.meth1("Hi B");
		
		C c = new C();
		c.meth1(a);
		c.meth1(2);
		
		a.meth1(a);
		a.meth1(null);
	}

}
