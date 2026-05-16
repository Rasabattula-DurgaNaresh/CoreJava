package com.designpattern.behavioural.strategy.test;

import com.designpattern.behavioural.strategy.CreditCardStrategy;
import com.designpattern.behavioural.strategy.Item;
import com.designpattern.behavioural.strategy.PaypalStrategy;
import com.designpattern.behavioural.strategy.ShoppingCart;

public class ShoppingCartTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1111", 100);
		Item item2 = new Item("2222", 200);
		
		cart.add(item1);
		cart.add(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		
		//pay by credit
		cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
	}

}
