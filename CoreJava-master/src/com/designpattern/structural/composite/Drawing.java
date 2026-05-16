package com.designpattern.structural.composite;
/**
 * Composite
 * A composite object contains group of leaf objects and we should provide some helper methods to add 
 * or delete leafs from the group. 
 * We can also provide a method to remove all the elements from the group.
 * Notice that composite also implements component and behaves similar to leaf 
 * except that it can contain group of leaf elements.
 */
import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
	//collection of shapes
	List<Shape> shapeList = new ArrayList<Shape>();
	
	@Override
	public void draw(String fillColor) {
		for(Shape sh: shapeList) {
			sh.draw(fillColor);
		}
	}
	
	 //adding shape to drawing
	public void add(Shape s) {
		shapeList.add(s);
	}
	
	//remove shape
	public void remove(Shape s) {
		shapeList.remove(s);
	}
	
	//removing all the shapes
    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapeList.clear();
    }
}
