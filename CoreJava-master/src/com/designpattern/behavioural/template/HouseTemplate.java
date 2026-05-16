package com.designpattern.behavioural.template;
/**
 * 
 * @author pardeshi_n
 *Template Method Abstract Class
 *Since we want some of the methods to be implemented by subclasses, 
 *we have to make our base class as abstract class.
 *buildHouse() is the template method and defines the order of execution for performing several steps.
 */
public abstract class HouseTemplate {
	//template method, final so subclasses can't override
	public final void buildHouse() {
		buildFoundations();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	
	public void buildFoundations() {
		System.out.println("Building foundation with cement,iron rods, glass and sand");
	}
	
	//methods to be implemented by subclasses
	public abstract void buildPillars();
	public abstract void buildWalls();
	
	public void buildWindows() {
		System.out.println("Building Glass Windows");
	}
}
