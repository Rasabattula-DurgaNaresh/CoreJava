package com.collections.hashmap;

public class User {
	private int userId;
	private String userName;
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return this.userId+", "+this.userName;
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
         
        User e = (User) o;
       return (this.getUserId() == e.getUserId());
         
    }
    
    @Override
    public int hashCode() {
    	final int PRIME = 31;
    	int result = 1;
    	 result = PRIME * result + getUserId();
    	 return result;
    }
}
