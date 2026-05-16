package com.cloning.copyconst;

public class Test {

	public static void main(String[] args) {
		PointOne o = new PointOne();
		o.setX(1);
		o.setY(2);
		PointOne one = new PointOne(o);
		
		PointTwo t = new PointTwo();
		t.setX(3);
		t.setY(4);
		t.setZ(5);
        PointTwo two = new PointTwo(t);
 
        PointOne clone1 = new PointOne(one);
        PointOne clone2 = new PointOne(two);
        PointOne clone3 = new PointTwo(two);
 
        //Let check for class types
        System.out.println(clone1.getClass());
        System.out.println(clone2.getClass());
        System.out.println(clone3.getClass());
	}

}
