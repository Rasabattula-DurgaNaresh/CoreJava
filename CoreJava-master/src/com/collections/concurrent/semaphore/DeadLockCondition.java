package com.collections.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class DeadLockCondition {

	public static void main(String[] args) throws InterruptedException {
		Semaphore s1 = new Semaphore(1);
		Semaphore s2 = new Semaphore(1);
		
		Thread t1 = new Thread(new DoubleResourceGrabber(s1, s2)); 
		Thread t2 = new Thread(new DoubleResourceGrabber(s2, s1)); 
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("We got lucky");
	}
	private static class DoubleResourceGrabber implements Runnable {
		private Semaphore first;
		private Semaphore second;
		
		DoubleResourceGrabber(Semaphore s1, Semaphore s2) {
			first = s1;
			second = s2;
		}
		
		@Override
		public void run() {
			try {
				Thread t = Thread.currentThread();
				first.acquire();
				System.out.println(t + " acquired " + first);
				Thread.sleep(200);
				second.acquire();
				System.out.println(t + " acquired " + second);
				second.release();
				System.out.println(t + " release " + second);
				first.release();
				System.out.println(t + " release " + first);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

