package com.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class TestRemoveHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("Java", 1);
        hashmap.put("Hungry" , 2);
        hashmap.put("Blogspot" , 3);
        hashmap.remove("Java");
        Iterator<String> iter = hashmap.keySet().iterator();
        while(iter.hasNext()) {
        	String key = iter.next();
        	//Can print  [23] [32] any as hashmap is unordered.
        	System.out.println(key+", "+hashmap.get(key));
        }

	}

}
