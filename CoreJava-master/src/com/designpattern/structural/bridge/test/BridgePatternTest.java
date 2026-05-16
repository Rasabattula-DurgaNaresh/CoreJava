package com.designpattern.structural.bridge.test;

import com.designpattern.structural.bridge.GreenColor;
import com.designpattern.structural.bridge.Pentagon;
import com.designpattern.structural.bridge.RedColor;
import com.designpattern.structural.bridge.Triangle;

public class BridgePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangle tri = new Triangle(new RedColor());
		tri.applyColor();
		Pentagon pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
