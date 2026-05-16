package com.designpattern.behavioural.visitor;
/**
 * 
 * @author pardeshi_n
 *To implement visitor pattern, first of all we will create different type of items 
 *(Elements) to be used in shopping cart.
 *Notice that accept method takes Visitor argument, we can have some other methods also 
 *specific for items but for simplicity I am not going into that much detail 
 *and focusing on visitor pattern only.
 */
public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
