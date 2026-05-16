package com.generics.genTypeClzInterfc;

/**
 * 
 * 
 * @author pardeshi_n
 *Cannot give implements DemoInterface<T1, T2> will giv compiler err need to provide type here
 */
public class DemoClass implements DemoInterface<String, Integer> {
	 public Integer doSomeOperation(String t)
	   {
		 System.out.println(t);
		return Integer.parseInt(t);
	   }
	   public String doReverseOperation(Integer t)
	   {
		   System.out.println(t);
		return t.toString();
	   }
}
