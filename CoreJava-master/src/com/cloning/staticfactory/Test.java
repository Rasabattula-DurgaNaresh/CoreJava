package com.cloning.staticfactory;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		PointOne one = new PointOne(1,2);
		PointTwo two = new PointTwo(1,2,3);
 
        PointOne clone1 = one.copyPoint(one);
    //    PointOne clone2 = new PointOne(two);
 
        //Let check for class types
     //   System.out.println(clone1.getClass());
     //   System.out.println(clone2.getClass());
	}

}
