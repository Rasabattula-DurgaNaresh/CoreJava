package com.designpattern.behavioural.chainOfResponsibility;
/**
 * 
 * @author pardeshi_n
 *The base interface should have a method to define the next processor in the chain 
 *and the method that will process the request. 
 *Our ATM Dispense interface will look like below.
 */
public interface DispenseChain {
	void setNextCHain(DispenseChain nextChain);
	void dispense(Currency curr);
}
