package com.lambda;

public class ThreadLambdaTest {
	
	public static void main(String[] args) {
		new Thread(
			    () -> System.out.println("hello world")
			).start();
	}
	
}
