package com.datastructure.node;

public class TwoChildNode {
	protected Object data;
    protected TwoChildNode left,right;

    public TwoChildNode(){
        data = null;
        left = right = null;
    }
    public TwoChildNode(Object d){
        data = d;
        left = right = null;
    }
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	/**
	 * @return the left
	 */
	public TwoChildNode getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(TwoChildNode left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public TwoChildNode getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(TwoChildNode right) {
		this.right = right;
	}
	 public String toString(){
	        return ""+data;
	    }
}
