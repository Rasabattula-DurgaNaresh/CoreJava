package com.designpattern.creational.factory;
/**
 * If you can use reflection, for example in Java or .NET languages, you can register new product classes 
 * to the factory without even changing the factory itself. 
 * For creating objects inside the factory class without knowing the object type we keep a map 
 * between the productID and the class type of the product. In this case when a new product is added 
 * to the application it has to be registered to the factory. 
 * This operation doesn't require any change in the factory class code.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import com.designpattern.creational.abstractfactory.Computer;

public class ComputerReflectionFactory {
	private HashMap m_RegisteredComp  = new HashMap();
	public void registerComputer(String computerType, Class computerClass) {
		m_RegisteredComp.put(computerType, computerClass);
	}
	
	public Computer createComputer(String computerType) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class computerClass = (Class)m_RegisteredComp.get(computerType);
		Constructor compConstructor = computerClass.getDeclaredConstructor(new Class[] { String.class });
		return (Computer)compConstructor.newInstance(new Object[] { });
	}
}
