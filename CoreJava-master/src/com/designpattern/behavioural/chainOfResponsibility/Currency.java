package com.designpattern.behavioural.chainOfResponsibility;
/**
 * 
 * @author pardeshi_n
 *We can create a class Currency that will store the amount to dispense 
 *and used by the chain implementations.
 */
public class Currency {
	private int amount;
	public Currency(int amt) {
		this.amount = amt;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	
}
