package com.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class TestHashMapRemove {
	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("Java", 1);
        hashmap.put("Hungry" , 2);
        hashmap.put("Blogspot" , 3);
        Iterator<String> iter = hashmap.keySet().iterator();
        while(iter.hasNext()) {
        	String key = iter.next();
        	
        	if(key.equalsIgnoreCase("Java"))
        		iter.remove();
        		//java.util.ConcurrentModificationException is thrown
        		//hashmap.remove(key);
        		//changes the output get 4 3 2
        	//	hashmap.put(key, 4);
        	System.out.println(key+", "+hashmap.get(key));
        }
        
       /* Iterator it = hashmap.entrySet().iterator();
        while (it.hasNext())
        {
           Entry entry = (Entry) it.next();
            System.out.println("Visiting " + entry.getKey());
            if (entry.getKey().equals("Java"))
            {
                System.out.println("Modifying it");
                entry.setValue(4);
            }
        }*/


	}
}
