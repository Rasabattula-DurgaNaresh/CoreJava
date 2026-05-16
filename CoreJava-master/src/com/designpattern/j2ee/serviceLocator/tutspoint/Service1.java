package com.designpattern.j2ee.serviceLocator.tutspoint;

public class Service1 implements Service{

	@Override
	public String getName() {
		return "Service1";
	}

	@Override
	public void execute() {
		System.out.println("Executing Service1");
	}

}
