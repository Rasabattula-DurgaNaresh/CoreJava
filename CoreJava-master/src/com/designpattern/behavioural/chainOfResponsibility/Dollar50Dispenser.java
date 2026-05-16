package com.designpattern.behavioural.chainOfResponsibility;
/**
 * 
 * @author pardeshi_n
 *Concrete Chain Implementations
 *We need to create different processor classes that will implement the DispenseChain interface 
 *and provide implementation of dispense methods. 
 *Since we are developing our system to work with three types of currency bills – 50$, 20$ and 10$, 
 *we will create three concrete implementations.
 *The important point to note here is the implementation of dispense method, 
 *you will notice that every implementation is trying to process the request and based on the amount, 
 *it might process some or full part of it. 
 *If it’s not able to process it fully, it sends the request to the next processor in chain 
 *to process the remaining request. 
 *If the processor is not able to process anything, 
 *it just forwards the same request to the next chain.
 */
public class Dollar50Dispenser implements DispenseChain {
	private DispenseChain chain;
	@Override
	public void setNextCHain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency curr) {
		if(curr.getAmount() >= 50) {
			int num = curr.getAmount()/50;
			int remainder = curr.getAmount()%50;
			System.out.println("Dispensing "+num+" 50$ note");
			if(remainder != 0) {
				this.chain.dispense(new Currency(remainder));
			} 
		} else {
			this.chain.dispense(curr);
		}
	}

}
