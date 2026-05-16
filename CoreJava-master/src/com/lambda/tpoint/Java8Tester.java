package com.lambda.tpoint;


public class Java8Tester {
	final static String salutation = "Helloooo! ";
	public static void main(String[] args) {
		MathOperation add = (a, b) -> a + b;
		System.out.println("Addition : "+add.operation(1, 2));
		
		MathOperation sub = (a, b) ->  { return a-b; };
		System.out.println("Subtraction : "+sub.operation(1, 2));
		
		GreetingService srv1 = message -> System.out.println("Hello "+ message); 
		srv1.sayMessage("Anu");
		
		GreetingService srv2 = (message) -> System.out.println("Byee "+ message);
		srv2.sayMessage("Nish");
		
		GreetingService srv3 = (message) -> System.out.println(salutation+" "+ message);
		srv3.sayMessage("AAA");
		
	}
	
	/*//Not required
	 * private int operate(int a, int b, MathOperation mathOperation){
	      return mathOperation.operation(a, b);
	   }*/
	
	
	interface MathOperation {
		public int operation(int a, int b);
	}
	
	 interface GreetingService {
	      void sayMessage(String message);
	   }
	 
	 
}
