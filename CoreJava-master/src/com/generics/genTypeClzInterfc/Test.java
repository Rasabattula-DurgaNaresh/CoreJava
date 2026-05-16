package com.generics.genTypeClzInterfc;

public class Test {

	public static void main(String[] args) {
		/*GenTypeClazzIntf t = new GenTypeClazzIntf();
		t.setT("aa");
		//compiler will not check type as it has not been provided
		t.setT(1);*/
		
		GenTypeClazzIntf<String> t1 = new GenTypeClazzIntf<>();
		t1.setT("aa");
		//The method setT(String) in the type GenTypeClazzIntf<String> is not applicable for the arguments (int)
		//t1.setT(1);
		
		DemoClass d = new DemoClass();
		d.doReverseOperation(2);
		d.doSomeOperation("11");
	}

}
