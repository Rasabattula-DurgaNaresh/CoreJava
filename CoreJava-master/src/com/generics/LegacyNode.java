package com.generics;

public class LegacyNode {
	
	private Object data;
	private LegacyNode next;
	
	public LegacyNode(Object data, LegacyNode next) {
		this.data = data;
		this.next = next;
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
	 * @return the next
	 */
	public LegacyNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(LegacyNode next) {
		this.next = next;
	}
	
	public String toString() {
		return this.data + (this.next == null? "" : ", " + this.next);
		}
	
	public static void main(String [] args) {
		LegacyNode node1 = new LegacyNode(4, null); // (Integer, null)
		LegacyNode node2 = new LegacyNode("July", node1); // (String, Integer, null)
		
		Object obj = node2.getData();
		System.out.println(obj);
		if (obj instanceof String) { // Is the object of the right type?
			String str = (String) obj; // Type conversion to the subclass String.
			System.out.println(str.toUpperCase()); // Specific method in the String class.
			}
	}
}
