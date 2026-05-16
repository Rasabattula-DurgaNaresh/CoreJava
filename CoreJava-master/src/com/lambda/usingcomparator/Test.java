package com.lambda.usingcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Employee> employees  = getEmployees();
		//System.out.println(employees);
		
		 //Sort all employees by first name
		employees.sort(Comparator.comparing(e -> e.getFirstName()));
		//OR
		employees.sort(Comparator.comparing(Employee::getFirstName));
	//	System.out.println(employees);
		
		 //Sort all employees by last name
		employees.sort(Comparator.comparing(e -> e.getLastName()));
	//	System.out.println(employees);
		
		//Sort all emp by age in reverse order
		employees.sort(Comparator.comparingInt(Employee::getAge).reversed());
	//	System.out.println(employees);
		
		//Sorting on First Name and then Last NAme
		/*Comparator<Employee> groupByComparator = employees.sort(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName));
		employees.sort(groupByComparator);
		System.out.println(employees);
		*/
		
		employees.sort(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName));
		
		/*//Parallel Sorting
		Employee[] employeesArray = employees.toArray(new Employee[employees.size()]);
		//Parallel sorting
		Arrays.parallelSort(employeesArray);
		 
		System.out.println(employeesArray);*/
	}
	
	private static List<Employee> getEmployees(){
	    List<Employee> employees  = new ArrayList<>();
	    employees.add(new Employee(1,"Lokesh", "Gupta", 32));
	    employees.add(new Employee(2,"Aman", "Sharma", 28));
	    employees.add(new Employee(3,"Aakash", "Yaadav", 52));
	    employees.add(new Employee(4,"James", "Hedge", 72));
	    employees.add(new Employee(5,"David", "Kameron", 19));
	    employees.add(new Employee(6,"Yash", "Chopra", 25));
	    employees.add(new Employee(7,"Karan", "Johar", 59));
	    employees.add(new Employee(8,"Balaji", "Subbu", 88));
	    employees.add(new Employee(9,"Vishu", "Bissi", 33));
	    employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));
	    return employees;
	}

}
