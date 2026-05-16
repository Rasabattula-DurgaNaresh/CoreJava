package com.designpattern.behavioural.visitor;
/**
 * 
 * @author pardeshi_n
 *Notice the implementation of accept() method in concrete classes, 
 *its calling visit() method of Visitor and passing itself as argument.
 */
public class Book implements ItemElement {
	private int price;
    private String isbnNumber;
    public Book(int pr, String isbn) {
    	this.price = pr;
    	this.isbnNumber = isbn;
    }
    
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @return the isbnNumber
	 */
	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
