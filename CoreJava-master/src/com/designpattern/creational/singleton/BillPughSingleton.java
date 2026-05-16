package com.designpattern.creational.singleton;
/**
 * 
 * @author pardeshi_n
 *Prior to Java 5, java memory model had a lot of issues and above approaches used to fail in certain scenarios 
 *where too many threads try to get the instance of the Singleton class simultaneously. 
 *So Bill Pugh came up with a different approach to create the Singleton class using a inner static helper class. 
 * the private inner static class that contains the instance of the singleton class. When the singleton class is loaded, 
 * SingletonHelper class is not loaded into memory and 
 * only when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.
 * 
 *A ClassLoader will not load a class, unless it was requested (e.g. using loadClass). 
 *While loading a class, a ClassLoader will request referenced classes.
 *As your class A does not reference A.B, A.B will not be loaded, whether it is static or not. 
 *(To be honest, A does reference A.B, but not in a manner causing the ClassLoader to load A.B.)
 *If you add a field of type A.B or use the type A.B in another way (e.g. as a method return type), 
 *it will actually be referenced in A.class and therefore be loaded.
 */
public class BillPughSingleton {
	private BillPughSingleton(){}
	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	/*public static void main(String[] args) {
		BillPughSingleton obj = new BillPughSingleton();
		obj.getInstance();
	//	BillPughSingleton.getInstance();
	}*/
}
