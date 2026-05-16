package com.collections.concurrent.ReentrantLock;


public class ReentrantLockDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Calculator(1,2)); 
		Thread t2 = new Thread(new Calculator(3,4)); 
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("end");
	}
}


