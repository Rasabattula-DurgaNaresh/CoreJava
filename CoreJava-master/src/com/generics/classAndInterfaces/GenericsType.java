package com.generics.classAndInterfaces;

public class GenericsType<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
	 public static void main(String args[]){
		 GenericsType<String> type = new GenericsType<>();
		 type.set("AAA");
		 System.out.println(type.get());
		 type.set("10");
		 System.out.println(type.get());
		 
		 GenericsType type1 = new GenericsType(); //raw type
	        type1.set("Pankaj"); //valid
	        System.out.println(type1.get());
	        type1.set(10); //valid and autoboxing support
	        System.out.println(type1.get());
	 }
}
