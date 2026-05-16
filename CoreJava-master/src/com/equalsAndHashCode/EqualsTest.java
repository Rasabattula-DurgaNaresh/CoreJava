package com.equalsAndHashCode;

import java.util.HashSet;
import java.util.Set;

public class EqualsTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
        Employee e2 = new Employee();
 
        e1.setId(100);
        e2.setId(100);
 
        //Prints false in console , when equals method is not overridden
        //Prints true in console when equals method is overridden
        System.out.println(e1.equals(e2));
        
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
         
        //Prints two objects 
        /**
         * If both employee objects have been equal, in a Set which stores only unique objects, 
         * there must be only one instance inside HashSet, after all both objects refer to same employee. 
         * We are missing the second important method hashCode(). 
         * As java docs say, if you override equals() method then you must override hashCode() method.
         */
        /**
         * Once hashCode method is added in Employee class, 
         * this statement start printing only single object in second statement, 
         * and thus validating the true equality of e1 and e2.
         */
        System.out.println(employees);
	}

}
