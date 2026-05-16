package com.collections.hashmap;

public class Department {
	private String deptName;
	private int deptId;
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	@Override
	public String toString() {
		return this.getDeptId()+", "+this.getDeptName();
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
         
        Department e = (Department) o;
       return (this.getDeptId() == e.getDeptId());
         
    }
    
    @Override
    public int hashCode() {
    	final int PRIME = 31;
    	int result = 1;
    	 result = PRIME * result + getDeptId();
    	 return result;
    }
}
