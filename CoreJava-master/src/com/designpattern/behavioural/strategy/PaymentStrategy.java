package com.designpattern.behavioural.strategy;
/**
 * 
 * @author pardeshi_n
 *Create the interface for our strategy, in our case to pay the amount passed as argument.
 */
public interface PaymentStrategy {
	public void pay(int amount);
}
