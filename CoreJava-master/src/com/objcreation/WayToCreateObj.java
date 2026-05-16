package com.objcreation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class WayToCreateObj {
	
	WayToCreateObj() {
		System.out.println("WayToCreateObj object created.");
	}
	
 @SuppressWarnings("resource")
public static void main(String [] args) {
		//1 Using new keyword
		ObjA a1 = new ObjA();
		
		//2 Using Class.forName(). Class.forName() gives you the class object, which is useful for reflection. 
		try {
		//	ObjB a2 = (ObjB)Class.forName("com.basics.objcreation.ObjB").newInstance();
			ObjA a2 = (ObjA)Class.forName("com.basics.objcreation.ObjA").newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//3 Using clone(). The clone() can be used to create a copy of an existing object.
		//ObjA needs to implement Cloneable interface and  write public Object clone() method
		//Else will give The method clone() from the type Object is not visible error as Because clone() is a protected method. 
		//In this a shallow copy of a1 is obtained in a3 .Hence constructor is not invoked.
		ObjA a3 = (ObjA) a1.clone();
		
		//4 Using newInstance() method
		try {
			ObjA a4 = (ObjA) ObjA.class.getClassLoader().loadClass("com.basics.objcreation.ObjA").newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//5 Using Object Deserialization. Object Deserialization is nothing but creating an object from its serialized form.
		//ObjA should implement Serializable else gets java.io.NotSerializableException 
		//Hence constructor of ObjA is not invoked.
		// Create Object5
		// create a new file with an ObjectOutputStream
		FileOutputStream out;
		try {
			out = new FileOutputStream("ObjA.txt");
			ObjectOutputStream oout = new ObjectOutputStream(out);
			 
			// write something in the file
			oout.writeObject(a1);
			oout.flush();
			 
			// create an ObjectInputStream for the file we created before
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ObjA.txt"));
			ObjA a5 = (ObjA) ois.readObject();
		 }  catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
		}
		
	/*	//
		Context ctx;
		try {
			ctx = new InitialContext();
			Context environmentCtx = (Context)ctx.lookup("ObjA");
			ObjA a6 = (ObjA)environmentCtx.lookup("ObjA");
		} catch (NamingException e) {
			e.printStackTrace();
		}*/
		
 	}
}
