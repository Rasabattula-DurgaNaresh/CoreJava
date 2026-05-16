package com.collections.map.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableIterator {

	public static void main(String[] args) {
		Hashtable<Integer,String> tbl = new Hashtable<Integer,String>();
		tbl.put(new Integer(1), "Two");
		tbl.put(new Integer(2), "One");
		tbl.put(new Integer(4), "Four");
		tbl.put(new Integer(3), "Three");
		
		Set<Entry<Integer,String>> set = tbl.entrySet();
		Iterator<Entry<Integer,String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer,String> map = itr.next();
			int key = map.getKey();
			String value = map.getValue();
			System.out.println("Key: "+key+" Value: "+value);
		}
	}

}
