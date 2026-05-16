package com.interfaces.innerinterfc;

public abstract class C {
	private C() {
		System.out.println("C constructor");
	}
	
	protected C(int i) {
		System.out.println("In overridden constre" +i);
		
	}
	private void B() {
		System.out.println("BBB");
	}
}
