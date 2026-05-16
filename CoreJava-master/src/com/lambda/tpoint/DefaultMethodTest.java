package com.lambda.tpoint;

public class DefaultMethodTest implements Vehicle,FourWheeler {

	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("i Am a car.");
	}
	
	public static void main(String[] args) {
		DefaultMethodTest test = new DefaultMethodTest();
		test.print();
	}
	
}

interface Vehicle {
	default void print() {
		System.out.println("This is a vehicle.");
	}
	static void blowHorn() {
		System.out.println("Bolwing Horn !!");
	}
}

interface FourWheeler {
	default void print() {
		System.out.println("This is a four wheeler.");
	}
}