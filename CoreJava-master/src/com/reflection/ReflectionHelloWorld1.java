package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionHelloWorld1 {

	public static void main(String[] args) {
		/*//Create a class without reflection
		Foo f = new Foo();
		System.out.println(f.getClass().getName());*/
		//create instance of "Class"
		Class<?> c = null;
		Method method;
		try {
			//Create class using reflection by new instance
			c = Class.forName("com.reflection.Foo");
			Foo f = null;
			f = (Foo) c.newInstance();
			
			//Create class using reflection using constructor
			Foo f1 = null;
			Foo f2 = null;
			
			//get all constructors
			Constructor<?> cons[] = c.getConstructors(); 
			f1 = (Foo)cons[0].newInstance("bb");
			f2 = (Foo)cons[1].newInstance();
			
			method = f.getClass().getMethod("printName", new Class[]{String.class});
			method.invoke(f2,"aa");
			
			method = f.getClass().getMethod("print", new Class<?>[0]);
			method.invoke(f);
			
			method = f.getClass().getMethod("printName",  new Class[] { String.class });
			method.invoke(f, new Object[] { "nish" });
			
			method = f.getClass().getMethod("meth1", new Class[]{String.class, Integer.class});
			method.invoke(f, new Object[] {"aaa",1});
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}

class Foo {
	String s;
	public Foo(String str) {
		this.s = str;
	}
	public Foo(){}

	public void print() {
		System.out.println("In print method.");
	}
	
	public void printName(String str) {
		System.out.println("In print method with name: "+str);
	}
	
	public void meth1(String str, Integer i) {
		System.out.println("In print method with name: "+str+" with number: "+i);
	}
}
