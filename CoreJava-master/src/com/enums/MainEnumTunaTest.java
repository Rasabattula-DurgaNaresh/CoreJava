package com.enums;

import java.util.EnumSet;

//EnumSet provides built in methods
public class MainEnumTunaTest {

	public static void main(String[] args) {
		for(Tuna tuna: Tuna.values()) {
			System.out.printf("%s\t%s\t%s\n",tuna,tuna.getDesc(),tuna.getYear());
		}
		System.out.println("Now in Range for constants");
		
		//start and end anywhere
		for(Tuna tuna: EnumSet.range(Tuna.kelsey, Tuna.candy)) {
			System.out.printf("%s\t%s\t%s\n",tuna,tuna.getDesc(),tuna.getYear());
		}
	}

}
