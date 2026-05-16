package com.annotations;

public class TestClass {
	private String str  = "abc";
	
	@Test(enabled=0,enabled1 = false)
	public void meth1() {
		System.out.println("meth1");
		System.out.println();
	}
}
