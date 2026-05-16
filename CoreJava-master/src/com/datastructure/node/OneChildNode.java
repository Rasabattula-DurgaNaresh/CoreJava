package com.datastructure.node;


public class OneChildNode {
	protected Object data;
	protected OneChildNode next;
	
	public OneChildNode() {
		data = null;
		next = null;
	}
	
	public OneChildNode(Object d, OneChildNode n) { 
		data = d;
		next = n;
	}
	public void setData(Object d) {
		data = d;
	}
	public void setNext(OneChildNode n) {
		next = n;
	}
	 public OneChildNode getNext(){
	       return next;
	 }
	 public Object getData(){
	       return data;
	 }
	 public String toString(){
	      return ""+data;
	 }
}
