package com.designpattern.creational.prototype.test;

import com.designpattern.creational.prototype.Employees;

public class PrototypePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employees emp = new Employees();
		emp.loadData();
		
		//Use the clone method to get the Employee object
		Employees emp1 = (Employees)emp.clone();
		Employees emp2 = (Employees)emp.clone();
		
		emp1.getEmpList().add("ABC");
		emp2.getEmpList().remove("Pankaj");
		
		System.out.println("EmpList: "+emp.getEmpList());
		System.out.println("EmpList1: "+emp1.getEmpList());
		System.out.println("EmpList2: "+emp2.getEmpList());
	}

}
