package com.annotations;

import java.util.Arrays;
import java.util.List;

public class DemoClass {
	
	/**
	 * checks that the annotated method is overridden method. 
	 * It causes a compile time “error” if the annotated method is not found in one of the parent classes 
	 * or implemented interfaces
	 */
	@Override
	   public String toString()
	   {
	      return super.toString();
	   }
	    
	   @Override
	   public int hashCode()
	   {
	      return super.hashCode();
	   }
	   /**
	    * 
	    * @return
	    * Use  on methods or classes which you need to mark as deprecated. 
	    * Any class that will try to use this deprecated class or method, will get a compiler “warning“.
	    */
	   @Deprecated
	   public Integer myMethod()
	   {
	       return null;
	   }
	   
	   /**
	    * Instructs the compiler to suppress the compile time warnings specified in the annotation parameters
	    *  either for a given attribute or at class level for all the unused attributes and unused methods.
	    */
	     private String str = null;    
	      
	   @SuppressWarnings("unused")
	     private String getString(){
	        return this.str;
	     }
	   
	   /**
	    * Introduced in java 7, this annotation ensures that the body of the annotated method or constructor 
	    * does not perform potentially unsafe operations on its varargs parameter.
	    * Applying this annotation to a method or constructor suppresses unchecked warnings 
	    * about a non-reifiable variable arity (vararg) type and suppresses unchecked warnings 
	    * about parameterized array creation at call sites.
	    */
	   @SafeVarargs
	public static <T> List<T> list( final T... items )
	   {
	       return Arrays.asList( items );
	   }
	   
	   /**
	    * 
	    * @author pardeshi_n
	    *Used to mark an interface as functional interface which are introduced in java 8. 
	    */
	   @FunctionalInterface
	   public interface MyFirstFunctionalInterface {
	       public void doSomeWork();
	   }
}
