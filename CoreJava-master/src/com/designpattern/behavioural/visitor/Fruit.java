package com.designpattern.behavioural.visitor;
/**
 * 
 * @author pardeshi_n
 *Notice the implementation of accept() method in concrete classes, 
 *its calling visit() method of Visitor and passing itself as argument.
 */
public class Fruit implements ItemElement {
	private int pricePerKg;
    private int weight;
    private String name;
    
    public Fruit(int priceKg, int wt, String nm){
        this.pricePerKg=priceKg;
        this.weight=wt;
        this.name = nm;
    }
    
	/**
	 * @return the pricePerKg
	 */
	public int getPricePerKg() {
		return pricePerKg;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
