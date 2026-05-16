package com.designpattern.creational.singleton;

import java.io.Serializable;

/**
 * 
 * @author pardeshi_n
 *The problem with above serialized singleton class is that whenever we deserialize it, 
 *it will create a new instance of the class.
 *So it destroys the singleton pattern, to overcome this scenario all 
 *we need to do it provide the implementation of readResolve() method.
 */
public class SerializedSingletonReadResolve implements Serializable {
	private static final long serialVersionUID = -7604766932017737115L;
	private SerializedSingletonReadResolve(){}
	private static class SingletonHelper {
		private static final SerializedSingletonReadResolve instance = new SerializedSingletonReadResolve();
	}
	public static SerializedSingletonReadResolve getInstance() {
		return SingletonHelper.instance;
	}
	protected Object readResolve() {
		return getInstance();
	}
}
