package com.generics.genTypeMethConstr;

public class Dimension<T> {
	   private T length;
	   private T width;
	   private T height;
	 
	   //Generic constructor
	   public Dimension(T length, T width, T height)
	   {
	      super();
	      this.length = length;
	      this.width = width;
	      this.height = height;
	   }

	/**
	 * @return the length
	 */
	public T getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(T length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public T getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(T width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public T getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(T height) {
		this.height = height;
	}
	   
}
