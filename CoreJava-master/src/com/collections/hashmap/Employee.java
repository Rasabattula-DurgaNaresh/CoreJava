package com.collections.hashmap;


public class Employee {
	private Integer empId;
    private String empName;
    private Department department;
    
    
	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
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
    
	@Override
	public String toString() {
		return this.empId+", "+this.empName+", "+this.getDepartment().getDeptId()+", "+this.getDepartment().getDeptName();
	}
	
	@Override
	    public boolean equals(Object o) {
	        if(o == null)
	        {
	            return false;
	        }
	        if (o == this)
	        {
	            return true;
	        }
	        if (getClass() != o.getClass())
	        {
	            return false;
	        }
	         
	        Employee e = (Employee) o;
	       return (this.getEmpId() == e.getEmpId());
	         
	    }
	    
	    @Override
	    public int hashCode() {
	    	final int PRIME = 31;
	    	int result = 1;
	    	 result = PRIME * result + getEmpId();
	    	 return result;
	    }
    
}
