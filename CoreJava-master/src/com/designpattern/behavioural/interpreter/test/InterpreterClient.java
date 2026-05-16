package com.designpattern.behavioural.interpreter.test;

import com.designpattern.behavioural.interpreter.Expression;
import com.designpattern.behavioural.interpreter.IntToBinaryExpression;
import com.designpattern.behavioural.interpreter.IntToHexExpression;
import com.designpattern.behavioural.interpreter.InterpreterContext;

public class InterpreterClient {
	public InterpreterContext ic;
    
    public InterpreterClient(InterpreterContext i){
        this.ic=i;
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "28 to Binary";
		String str2 = "28 in Hexadecimal";
		
		InterpreterClient ec = new InterpreterClient(new InterpreterContext());
		System.out.println(str1+"= "+ec.interpret(str1));
        System.out.println(str2+"= "+ec.interpret(str2));
	}
	
	public String interpret(String str) {
		Expression exp=null;
        //create rules for expressions
		if(str.contains("Hexadecimal")) {
			exp = new IntToHexExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		} else if(str.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		} else return str;
		return exp.interpret(ic);
	}

}
