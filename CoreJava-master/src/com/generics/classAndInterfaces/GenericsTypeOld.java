package com.generics.classAndInterfaces;

public class GenericsTypeOld {
	private Object t;
	public Object get() {
		return t;
	}
	public void set(Object t) {
		this.t = t;
	}
	 public static void main(String args[]){
		 GenericsTypeOld o = new GenericsTypeOld();
		 o.set("AAA");
		//type casting, error prone and can cause ClassCastException
		 String str = (String)o.get();
		 System.out.println(str);
	 }
}
