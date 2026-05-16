package com.designpattern.behavioural.interpreter;
/**
 * 
 * @author pardeshi_n
 *we need to create different types of Expressions that will consume the interpreter context class.
 */
public interface Expression {
	String interpret(InterpreterContext ic);
}
