package com.designpattern.creational.factory.test;

import com.designpattern.creational.factory.Computer;
import com.designpattern.creational.factory.ComputerFactory;

public class TestFactory {
	 public static void main(String[] args) {
		 Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
	     Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
	     System.out.println("Factory PC Config::"+pc);
	     System.out.println("Factory Server Config::"+server);
	 }
}
