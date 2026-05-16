package com.designpattern.behavioural.interpreter;
/**
 * 
 * @author pardeshi_n
 *We will have two expression implementations, one to convert int to binary 
 *and other to convert int to hexadecimal format.
 */
public class IntToHexExpression implements Expression {
	private int i;
	public IntToHexExpression(int c) {
		this.i = c;
	}
	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getHexaDecimalFormat(i);
	}

}
