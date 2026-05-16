package com.designpattern.behavioural.observer;
/**
 * 
 * @author pardeshi_n
 *Create contract for Observer, there will be a method to attach the Subject to the observer 
 *and another method to be used by Subject to notify of any change.
 */
public interface Observer {
	//method to update the observer, used by subject
	public void update();
	//attach with subject to observe
	public void setSubject(Subject subject);
}
