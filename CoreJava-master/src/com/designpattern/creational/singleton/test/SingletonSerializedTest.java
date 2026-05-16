package com.designpattern.creational.singleton.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.designpattern.creational.singleton.SerializedSingleton;
import com.designpattern.creational.singleton.SerializedSingletonReadResolve;

public class SingletonSerializedTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton inst1 = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
        "filename.ser"));
		out.writeObject(inst1);
		out.close();
		
		//deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream(
        "filename.ser"));
		SerializedSingleton inst2 = (SerializedSingleton)in.readObject();
		in.close();
		
		System.out.println(inst1);
		System.out.println(inst2);
		
		SerializedSingletonReadResolve in1 = SerializedSingletonReadResolve.getInstance();
		ObjectOutput out1 = new ObjectOutputStream(new FileOutputStream(
        "filename1.ser"));
		out1.writeObject(in1);
		out1.close();
		
		//deserailize from file to object
		ObjectInput inpt = new ObjectInputStream(new FileInputStream(
        "filename1.ser"));
		SerializedSingletonReadResolve in2 = (SerializedSingletonReadResolve)inpt.readObject();
		inpt.close();
		
		System.out.println(in1);
		System.out.println(in2);
		
		
	}
}
