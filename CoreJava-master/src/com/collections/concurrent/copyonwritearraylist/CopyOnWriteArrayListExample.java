package com.collections.concurrent.copyonwritearraylist;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();
		threadSafeList.add("Java");
		threadSafeList.add("Collections");
		threadSafeList.add("Java");
		
		Iterator<String> failSafeIterator  = threadSafeList.iterator();
		while(failSafeIterator .hasNext()) {
			System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
            failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java
		}
	}

}
