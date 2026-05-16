package com.designpattern.behavioural.strategy;

public class PaypalStrategy implements PaymentStrategy {
	private String emailId;
	private String password;
	
	public PaypalStrategy(String em, String pwd) {
		this.emailId = em;
		this.password = pwd;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}
