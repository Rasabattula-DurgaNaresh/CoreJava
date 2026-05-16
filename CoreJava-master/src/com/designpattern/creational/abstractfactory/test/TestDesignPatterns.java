package com.designpattern.creational.abstractfactory.test;

import com.designpattern.creational.abstractfactory.Computer;
import com.designpattern.creational.abstractfactory.ComputerFactory;
import com.designpattern.creational.abstractfactory.PCFactory;
import com.designpattern.creational.abstractfactory.ServerFactory;

public class TestDesignPatterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("3 GB","600 GB","3.6 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
	    System.out.println("AbstractFactory Server Config::"+server);
	}

}
