package com.designpattern.behavioural.interpreter;

public class InterpreterContext {
	public String getBinalryFormat(int i) {
		return Integer.toBinaryString(i);
	}
	public String getHexaDecimalFormat(int i) {
		return Integer.toHexString(i);
	}
}
