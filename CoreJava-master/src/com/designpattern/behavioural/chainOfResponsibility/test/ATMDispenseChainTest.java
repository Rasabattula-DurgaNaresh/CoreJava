package com.designpattern.behavioural.chainOfResponsibility.test;

import java.util.Scanner;

import com.designpattern.behavioural.chainOfResponsibility.ATMDispenseChain;
import com.designpattern.behavioural.chainOfResponsibility.Currency;
import com.designpattern.behavioural.chainOfResponsibility.DispenseChain;
import com.designpattern.behavioural.chainOfResponsibility.Dollar10Dispenser;
import com.designpattern.behavioural.chainOfResponsibility.Dollar20Dispenser;
import com.designpattern.behavioural.chainOfResponsibility.Dollar50Dispenser;

public class ATMDispenseChainTest {
	private DispenseChain c1;
	/**
	 * @param args
	 */
	
	public ATMDispenseChainTest() {
		// initialize the chain
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();
		
		// set the chain of responsibility
		c1.setNextCHain(c2);
		c2.setNextCHain(c3);
	}
	
	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		while(true) {
			int amount = 0 ;
			System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
		}
	}

}
