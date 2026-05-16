package com.designpattern.behavioural.mediator;
/**
 * 
 * @author pardeshi_n
 *Mediator Interface
 *First of all we will create Mediator interface that will define the contract for concrete mediators.
 */
public interface ChatMediator {
	public void sendMessage(String message, User user);
	public void addUser(User user);
}
