package com.enumu.reverselookup;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Direction {
	 // Enum types
    EAST(0), WEST(180), NORTH(90), SOUTH(270);
    // Constructor
    private Direction(final int angle) {
        this.angle = angle;
    }
 
    // Internal state
    private int angle;
 
    public int getAngle() {
        return angle;
    }
    private static final Map lookup = new HashMap();
    
    static {
        for (Direction s : EnumSet.allOf(Direction.class))
            lookup.put(s.getAngle(), s);
    }
    public static Direction get(int angle) {
        return (Direction) lookup.get(angle);
    }
}
