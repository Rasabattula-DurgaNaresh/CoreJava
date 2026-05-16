package com.designpattern.behavioural.strategy;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String ccv;
	private String expiryDate;
	public CreditCardStrategy(String nm, String no, String ccv, String expDt) {
		this.name = nm;
		this.cardNumber = no;
		this.ccv = ccv;
		this.expiryDate = expDt;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount +" paid with credit/debit card");
	}

}
