package com.designpattern.creational.singleton.test;

import java.lang.reflect.Constructor;

import com.designpattern.creational.singleton.EagerInitializedSingleton;
import com.designpattern.creational.singleton.EnumSingleton;

/**
 * 
 * @author pardeshi_n
 *Reflection can be used to destroy all the above singleton implementation approaches. 
 */
public class ReflectionSingletonTest {
	public static void main(String[] args) {
		EagerInitializedSingleton inst1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton inst2 = null;
		try {
			Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for(Constructor<?> constructor : constructors) {
				//Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				inst2 = (EagerInitializedSingleton)constructor.newInstance();
				break;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(inst1.hashCode());
		System.out.println(inst2.hashCode());
		
		/*To overcome this situation with Reflection, Joshua Bloch suggests the use of Enum to 
		 * implement Singleton design pattern 
		 *as Java ensures that any enum value is instantiated only once in a Java program.*/
		EnumSingleton in1 = EnumSingleton.INSTANCE;
		EnumSingleton in2 = null;
		try {
			Constructor<?>[] constructors = EnumSingleton.class.getDeclaredConstructors();
			for(Constructor<?> constructor : constructors) {
				//Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				in2 = (EnumSingleton)EnumSingleton.INSTANCE;
				break;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(in1.hashCode());
		System.out.println(in2.hashCode());
	}
}
