package com.designpattern.structural.decorator.test;

import com.designpattern.structural.decorator.BasicCar;
import com.designpattern.structural.decorator.Car;
import com.designpattern.structural.decorator.LuxuryCar;
import com.designpattern.structural.decorator.SportsCar;

public class DecoratorPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car sportscar = new SportsCar(new BasicCar());
		sportscar.assemble();
		System.out.println("*************************************");
		Car sportLuxCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportLuxCar.assemble();
	}

}
