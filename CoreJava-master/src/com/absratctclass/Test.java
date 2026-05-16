package com.absratctclass;

public class Test {

	public static void main(String[] args) {
		Enclosing e = new Enclosing();
	    Enclosing.AbNestedClass ea = e.new NestedClass();
	     
	    AbstractEnclosing ae = new ExtendedAbstract();
	    AbstractEnclosing.main(null);
	    ExtendedAbstract exta = (ExtendedAbstract)ae;
	    ExtendedAbstract.AbNestedClass2 exta2 = exta.new NestedClass3();
	    
	    AbstractEnclosing2 e2 = new ExtendedAbstract1();
	    AbstractEnclosing2.AbNestedClass3.meth1();
	}

}

class Enclosing {
		Enclosing() {System.out.println("Enclosing");}
	  abstract class AbNestedClass { AbNestedClass() {System.out.println(" Abstract AbNestedClass");}}
	  class NestedClass extends AbNestedClass {NestedClass() {System.out.println("NestedClass extends AbNestedClass");}}
	}
	  
abstract class AbstractEnclosing {
	public static void main(String[] args){
		System.out.println("in public static void main(String[] args)");
	}
		AbstractEnclosing() {System.out.println("AbstractEnclosing");}
	 public abstract class AbNestedClass2 {AbNestedClass2() {System.out.println("AbNestedClass2");}}
	  public class NestedClass2 extends AbNestedClass2 {NestedClass2() {System.out.println("NestedClass2 extends AbNestedClass2");}}
	}
	  
	class ExtendedAbstract extends AbstractEnclosing {
		ExtendedAbstract() {System.out.println("ExtendedAbstract extends AbstractEnclosing");}
	  class NestedClass3 extends NestedClass2 {NestedClass3() {System.out.println("NestedClass3 extends NestedClass2");}}
	}
	
	//Illegal modifier for the class AbstractEnclosing1; only public, abstract & final are permitted
	/*static abstract class AbstractEnclosing1 {
		}*/
	
	abstract class AbstractEnclosing2 {AbstractEnclosing2() {System.out.println("AbstractEnclosing2");}
		static abstract class AbNestedClass3 {AbNestedClass3() {System.out.println("AbNestedClass3");}
			public static void meth1() {
				System.out.println("in meth1()");
			}
		}
	}
	class ExtendedAbstract1 extends AbstractEnclosing2 {
		ExtendedAbstract1() {System.out.println("ExtendedAbstract1 extends AbstractEnclosing2");}
	}
	class ExtendedAbstract2 extends AbstractEnclosing2.AbNestedClass3 {
		ExtendedAbstract2() {System.out.println("ExtendedAbstract2 extends AbstractEnclosing2.AbNestedClass3");}
	}
	