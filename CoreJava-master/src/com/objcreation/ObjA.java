package com.objcreation;

import java.io.Serializable;

public class ObjA implements Cloneable, Serializable {
	ObjA() {
		System.out.println("ObjA created");
	}
	public Object clone(){  
	    try{  
	        return super.clone();  
	    }catch(Exception e){ 
	        return null; 
	    }
	}
}
