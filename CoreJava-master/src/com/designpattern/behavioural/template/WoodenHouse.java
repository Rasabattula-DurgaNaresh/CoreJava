package com.designpattern.behavioural.template;
/**
 * 
 * @author pardeshi_n
 *Template Method Concrete Classes
 *We can have different type of houses, such as Wooden House and Glass House.
 *We could have overridden other methods also.
 */
public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

}
