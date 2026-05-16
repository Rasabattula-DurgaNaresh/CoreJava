package com.cloning.copyconst;

public class PointTwo extends PointOne {
	private Integer z;
	 
    public PointTwo(PointTwo point){
        super(point); //Call Super class constructor here
        this.z = point.z;
    }

	public PointTwo() {
	}

	/**
	 * @return the z
	 */
	public Integer getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(Integer z) {
		this.z = z;
	}
    
    
}
