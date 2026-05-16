package com.designpattern.behavioural.strategy;

public class Item {
	private String upcCode;
    private int price;
    
    public Item(String upc, int pr) {
    	this.upcCode = upc;
    	this.price = pr;
    }

	/**
	 * @return the upcCode
	 */
	public String getUpcCode() {
		return upcCode;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
    
    
}
