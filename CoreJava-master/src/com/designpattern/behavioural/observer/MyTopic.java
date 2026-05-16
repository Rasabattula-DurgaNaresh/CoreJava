package com.designpattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author pardeshi_n
 *The method implementation to register and unregister an observer is very simple, 
 *the extra method is postMessage() that will be used by client application 
 *to post String message to the topic.
 * Notice the boolean variable to keep track of the change in the state 
 * of topic and used in notifying observers. 
 * This variable is required so that if there is no update and somebody calls notifyObservers() method, 
 * it doesn’t send false notifications to the observers.
 * Also notice the use of synchronization in notifyObservers() method to make sure the notification is sent 
 * only to the observers registered before the message is published to the topic.
 */
public class MyTopic implements Subject {
	private List<Observer> observerList;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();

	public MyTopic() {
		this.observerList = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer observer) {
		if(observer == null) throw new NullPointerException("No Observers");
		synchronized (MUTEX) {
			if(!observerList.contains(observer)) 
				observerList.add(observer);
		}
	}

	@Override
	public void unregister(Observer observer) {
		synchronized (MUTEX) {
			observerList.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		//synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (MUTEX) {
			if(!changed) 
				return;
			observersLocal = new ArrayList<Observer>(this.observerList);
			this.changed = false;
		}
		for(Observer obj: observersLocal) {
			obj.update();
		}
	}

	@Override
	public Object getUpdates(Observer observer) {
		return this.message;
	}
	
	 //method to post message to the topic
	public void postMessage(String msg) {
		System.out.println("Message posted to the topic : "+msg);;
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}

}
