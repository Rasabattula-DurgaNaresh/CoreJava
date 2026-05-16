/**
 * isEqual method signature showing syntax to use generics type in methods. 
 * Also notice how to use these methods in our java program. We can specify type while calling these 
 * methods or we can invoke them like a normal method. 
 * Java compiler is smart enough to determine the type of variable to be used, 
 * this facility is called as type inference.
 */
package com.generics.genericsInConstructors;

import com.generics.classAndInterfaces.GenericsType;

public class GenericsMethods {
	//Generics in method
	public static<T> boolean isEqual(GenericsType<T> t1, GenericsType<T> t2) {
		return t1.get().equals(t2.get());
	}
	public static void main(String args[]){
		GenericsType<String> t1 = new GenericsType<>();
		t1.set("AAA");
		GenericsType<String> t2 = new GenericsType<>();
		t2.set("AAA");
		boolean isEqual = isEqual(t1, t2);
		//above statement can be written simply as
        isEqual = GenericsMethods.isEqual(t1, t2);
        //This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
        //Compiler will infer the type that is needed
	}
}
