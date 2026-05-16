package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastImpl {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList nameList = new ArrayList();
		nameList.add("praveen");
		nameList.add("ravi");
		nameList.add("javarevisited");
		nameList.add("chinni");

		Iterator itr = nameList.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			int temp = string.indexOf(string);
			if ("ravi".equals(string)) {
			//	Collections remove and list remove method throw java.util.ConcurrentModificationException
				nameList.remove(temp);
			//Iterator remove method doesnot throw exception	
				//itr.remove();
			}
			System.out.println(string);
		}
	}
}
