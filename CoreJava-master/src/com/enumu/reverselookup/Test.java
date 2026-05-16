package com.enumu.reverselookup;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		 System.out.println(Direction.NORTH.getAngle());
		 System.out.println(Direction.get(90));
		 
		 Set enumSet = EnumSet.of(Direction.EAST,
	             Direction.WEST,
	             Direction.NORTH,
	             Direction.SOUTH
	         );
		 
		for(Object s: enumSet) {
			System.out.println(s);
		}
		
		 //Keys can be only of type Direction
        Map enumMap = new EnumMap(Direction.class);

       //Populate the Map
        enumMap.put(Direction.EAST, Direction.EAST.getAngle());
        enumMap.put(Direction.WEST, Direction.WEST.getAngle());
        enumMap.put(Direction.NORTH, Direction.NORTH.getAngle());
        enumMap.put(Direction.SOUTH, Direction.SOUTH.getAngle());
        
        for(Object obj: enumMap.entrySet()) {
        	System.out.println(obj.toString());
        }
	}

}
