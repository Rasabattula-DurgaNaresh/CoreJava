package com.designpattern.behavioural.command;
/**
 * 
 * @author pardeshi_n
 *Command Interface and Implementations
 *We can use interface or abstract class to create our base Command, it’s a design decision 
 *and depends on your requirement. 
 *We are going with interface because we don’t have any default implementations.
 *
 *Now we need to create implementations for all the different types of action performed by the receiver, 
 *since we have three actions we will create three Command implementations 
 *and each Command implementation will forward the request to the appropriate method of receiver.
 */
public interface Command {
	void execute();
}
