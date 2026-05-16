package com.designpattern.creational.singleton;

public class DoubleCHeckedLockingSingleton {
	private static DoubleCHeckedLockingSingleton instance;
	private DoubleCHeckedLockingSingleton(){}
	public static DoubleCHeckedLockingSingleton getInstance() {
		if(instance == null) {
			synchronized (DoubleCHeckedLockingSingleton.class) {
				if(instance == null) {
					instance = new DoubleCHeckedLockingSingleton();
				}
			}
		}
		return instance;
	}
}
