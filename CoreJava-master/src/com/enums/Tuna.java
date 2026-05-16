package com.enums;

//Enumerations are constants that are also objects.
//Java automatically takes these constants and build in array (Tuna.values()).
public enum Tuna {
	bucky("nice", "22"),
	kelsey("cutie", "7"),
	julia("bigmistake", "12"),
	nicole("italian", "13"),
	candy("different","14"),
	erren("wish","16");
	
	private final String desc;
	private final String year;
	
	Tuna(String d, String y){
		desc = d;
		year = y;
	}

	public String getDesc() {
		return desc;
	}

	public String getYear() {
		return year;
	}
	
}
