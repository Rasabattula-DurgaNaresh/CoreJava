package com.designpattern.behavioural.interpreter;
/**
 * 
 * @author pardeshi_n
 *We will have two expression implementations, one to convert int to binary 
 *and other to convert int to hexadecimal format.
 */
public class IntToBinaryExpression implements Expression {
	private int i;
	public IntToBinaryExpression(int c) {
		this.i = c;
	}
	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getBinalryFormat(i);
	}

}
