package com.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setUserId(1);
		u1.setUserName("U1");
		User u2 = new User();
		u2.setUserId(2);
		u2.setUserName("U2");
		HashMap<Integer, User> h1 = new HashMap<>();
		h1.put(u1.getUserId(), u1);
		h1.put(u2.getUserId(), u2);
		
		Iterator<Integer> i1 = h1.keySet().iterator();
		while (i1.hasNext()) {
			System.out.println(h1.get(i1.next()));
		}
		System.out.println("*** Change Username U1 to U1_1 *****");
		u1.setUserName("U1_1");
		Iterator<Integer> i2 = h1.keySet().iterator();
		while (i2.hasNext()) {
			System.out.println(h1.get(i2.next()));
		}
		System.out.println("*** Change Id 1 to 3 *****");
		u1.setUserId(3);
		Iterator<Integer> i3 = h1.keySet().iterator();
		while (i3.hasNext()) {
			System.out.println(h1.get(i3.next()));
		}
		System.out.println("*** Add u1 to list again *****");
		h1.put(u1.getUserId(), u1);
		Iterator<Integer> i4 = h1.keySet().iterator();
		while (i4.hasNext()) {
			System.out.println(h1.get(i4.next()));
		}
		System.out.println("*** Add u1 to list again *****");
		h1.put(u1.getUserId(), u1);
		Iterator<Integer> i5 = h1.keySet().iterator();
		while (i5.hasNext()) {
			System.out.println(h1.get(i5.next()));
		}
		
		/** Without overriding and equals
		 * 	1, U1
			2, U2
			*** Change Username U1 to U1_1 *****
			1, U1_1
			2, U2
			*** Change Id 1 to 3 *****
			3, U1_1
			2, U2
			*** Add u1 to list again *****
			3, U1_1
			2, U2
			3, U1_1
			*** Add u1 to list again *****
			3, U1_1
			2, U2
			3, U1_1
		 */
		Department d1 = new Department();
		d1.setDeptId(10);
		d1.setDeptName("D1");
		
		Employee e1 = new Employee();
		e1.setEmpId(100);
		e1.setEmpName("E1");
		e1.setDepartment(d1);
		
		Department d2 = new Department();
		d2.setDeptId(11);
		d2.setDeptName("D2");
		
		Employee e2 = new Employee();
		e2.setEmpId(101);
		e2.setEmpName("E2");
		e2.setDepartment(d2);
		
		HashMap<Employee, Department> h2 = new HashMap<>();
		h2.put(e1, d1);
		h2.put(e2, d2);
		System.out.println("*** Add e1 and e2 to list again *****");
		Iterator<Employee> it1 = h2.keySet().iterator();
		while (it1.hasNext()) {
			Employee k1 = it1.next();
			System.out.println(k1);
			System.out.println(h2.get(k1));
		}
		
		System.out.println("*** Change EmpName E1 to E1_1 *****");
		e1.setEmpName("E1_1");
		Iterator<Employee> it2 = h2.keySet().iterator();
		while (it2.hasNext()) {
			Employee k2 = it2.next();
			System.out.println(k2);
			System.out.println(h2.get(k2));
		}
		System.out.println("*** Change DeptId 100 to 102 *****");
		d1.setDeptId(102);
		Iterator<Employee> it3 = h2.keySet().iterator();
		while (it3.hasNext()) {
			Employee k3 = it3.next();
			System.out.println(k3);
			System.out.println(h2.get(k3));
		}
		System.out.println("*** Change EmpId 10 to 12 *****");
		e1.setEmpId(12);
		Iterator<Employee> it4 = h2.keySet().iterator();
		while (it4.hasNext()) {
			Employee k4 = it4.next();
			System.out.println(k4);
			System.out.println(h2.get(k4));
		}
		System.out.println("*** put EmpId 12 to hashmap *****");
		h2.put(e1, d1);
		Iterator<Employee> it5 = h2.keySet().iterator();
		while (it5.hasNext()) {
			Employee k5 = it5.next();
			System.out.println(k5);
			System.out.println(h2.get(k5));
		}
		
		/**
		 * *** Add e1 and e2 to list again *****
			100, E1, 10, D1
			10, D1
			101, E2, 11, D2
			11, D2
			*** Change EmpName E1 to E1_1 *****
			100, E1_1, 10, D1
			10, D1
			101, E2, 11, D2
			11, D2
			*** Change DeptId 100 to 102 *****
			100, E1_1, 102, D1
			102, D1
			101, E2, 11, D2
			11, D2
			*** Change EmpId 10 to 12 *****
			12, E1_1, 102, D1
			102, D1
			101, E2, 11, D2
			11, D2
			*** put EmpId 12 to hashmap *****
			12, E1_1, 102, D1
			102, D1
			101, E2, 11, D2
			11, D2
		 */
	}

}
