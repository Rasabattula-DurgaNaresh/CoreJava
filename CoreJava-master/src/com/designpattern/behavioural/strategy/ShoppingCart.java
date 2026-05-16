package com.designpattern.behavioural.strategy;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author pardeshi_n
 *Notice that payment method of shopping cart requires payment algorithm 
 *as argument and doesn’t store it anywhere as instance variable.
 */
public class ShoppingCart {
	//List of items
    List<Item> items;
    public ShoppingCart() {
    	items = new ArrayList<Item>();
    }
    
    public void add(Item item) {
    	items.add(item);
    }
    
    public void remove(Item item) {
    	items.remove(item);
    }
    public int calculateTotal() {
    	int sum = 0;
    	for(Item itm : items) {
    		sum += itm.getPrice();
    	}
    	return sum;
    }
    public void pay(PaymentStrategy payStrategy) {
    	int amount = calculateTotal();
    	payStrategy.pay(amount);
    }
}
