package com.lambda;

public class Employee {
	private int empoyeeId;
    private String employeeName;
 
    public Employee(int id, String name)
    {
        this.empoyeeId = id;
        this.employeeName = name;
    }
    
    public Employee(String name)
    {
        this.employeeName = name;
    }
    
	/**
	 * @return the empoyeeId
	 */
	public int getEmpoyeeId() {
		return empoyeeId;
	}

	/**
	 * @param empoyeeId the empoyeeId to set
	 */
	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String toString() {
		return employeeName;
		
	}
	
	public static int nameCompare(Employee e1, Employee e2) {
		return e1.employeeName.compareTo(e2.employeeName);
	}
}
