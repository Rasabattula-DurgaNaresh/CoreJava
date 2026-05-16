package com.cloning.deep;

public class Employee implements Cloneable {
	private int empoyeeId;
    private String employeeName;
    private Department department;
 
    public Employee(int id, String name, Department dept)
    {
        this.empoyeeId = id;
        this.employeeName = name;
        this.department = dept;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	Employee cloned = (Employee)super.clone();
    	cloned.setDepartment((Department)cloned.getDepartment().clone());
		return cloned;
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

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
    
    
}
