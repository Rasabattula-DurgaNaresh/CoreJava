package com.designpattern.behavioural.observer;
/**
 * 
 * @author pardeshi_n
 *Notice the implementation of update() method where it’s calling Subject 
 *getUpdate() method to get the message to consume.
 *We could have avoided this call by passing message as argument to update() method.
 */
public class MyTopicSubscriber implements Observer {

	private String name;
	private Subject topic;
	
	public MyTopicSubscriber(String nm) {
		this.name = nm;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdates(this);
		if(msg == null) {
			System.out.println(name+" :: No new message");
		} else {
			System.out.println(name+":: Consuming message::"+msg);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
	}

}
