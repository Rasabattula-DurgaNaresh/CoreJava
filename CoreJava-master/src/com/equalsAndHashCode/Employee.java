package com.equalsAndHashCode;

public class Employee {
	private Integer id;
    private String firstname;
    private String lastName;
    private String department;
 
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    /**
     * using Apache Commons Lang
     */
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
        /*  return new EqualsBuilder().
                append(getId(), e.getId()).
                isEquals();*/
        return (this.getId() == e.getId());
         
    }
    
    /**
     * using Apache Commons Lang
     */
    @Override
    public int hashCode() {
    	final int PRIME = 31;
    	int result = 1;
    	 result = PRIME * result + getId();
    	 return result;
    	//	return new HashCodeBuilder(getId()%2==0?getId()+1:getId(), PRIME).toHashCode();
    	
    }
}
