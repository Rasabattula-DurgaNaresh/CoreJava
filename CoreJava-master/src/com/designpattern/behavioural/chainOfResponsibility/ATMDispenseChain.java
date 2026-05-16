package com.designpattern.behavioural.chainOfResponsibility;


/**
 * 
 * @author pardeshi_n
 *Creating the Chain
 *This is a very important step and we should create the chain carefully, 
 *otherwise a processor might not be getting any request at all. 
 *For example, in our implementation if we keep the first processor chain as Dollar10Dispenser 
 *and then Dollar20Dispenser, 
 *then the request will never be forwarded to the second processor and the chain will become useless.
 */
public class ATMDispenseChain {
	public DispenseChain c1;
	public ATMDispenseChain() {
		 // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
 
        // set the chain of responsibility
        c1.setNextCHain(c2);
        c2.setNextCHain(c3);
	}
}
