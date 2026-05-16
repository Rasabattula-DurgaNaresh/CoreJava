package com.cloning.copyconst;

public class PointOne {
	 private Integer x;
	    private Integer y;
	 
	    public PointOne(PointOne point){
	        this.x = point.x;
	        this.y = point.y;
	    }

		public PointOne() {
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
