package com.designpattern.behavioural.observer;
/**
 * 
 * @author pardeshi_n
 * The base Subject interface that defines the contract methods to be implemented by any concrete subject.
 */
public interface Subject {
	//methods to register and unregister observers
	public void register(Observer observer);
	public void unregister(Observer observer);
	
	//method to notify observers of change
	public void notifyObservers();
	
	 //method to get updates from subject
	public Object getUpdates(Observer observer);
}
