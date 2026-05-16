package com.cloning.staticfactory;

public class PointOne {
	 private Integer x;
	 private Integer y;
	 
	    public PointOne(Integer x, Integer y){
	        this.x = x;
	        this.y = y;
	    }

	    public PointOne copyPoint(PointOne point) throws CloneNotSupportedException
	    {
	        if(!(point instanceof Cloneable))
	        {
	            throw new CloneNotSupportedException("Invalid cloning");
	        }
	        //Can do multiple other things here
	        return new PointOne(point.x, point.y);
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
}
