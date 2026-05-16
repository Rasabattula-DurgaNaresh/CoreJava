package com.designpattern.creational.singleton;
/**
 * 
 * @author pardeshi_n
 *Static block initialization implementation is similar to eager initialization, 
 *except that instance of class is created in the static block that provides option for exception handling.
 *Both eager initialization and static block initialization creates the instance even 
 *before it’s being used and that is not the best practice to use.
 */
public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	private StaticBlockSingleton() {};
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
