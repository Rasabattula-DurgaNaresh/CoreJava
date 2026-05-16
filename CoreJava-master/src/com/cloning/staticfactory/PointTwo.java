package com.cloning.staticfactory;

public class PointTwo extends PointOne {
	private Integer x;
	private Integer y;
	private Integer z;
	public PointTwo(Integer x, Integer y, Integer z) {
		super(x, y);
		this.z = z;
	}
	/**
	 * @return the x
	 */
	public Integer getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(Integer x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public Integer getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(Integer y) {
		this.y = y;
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
