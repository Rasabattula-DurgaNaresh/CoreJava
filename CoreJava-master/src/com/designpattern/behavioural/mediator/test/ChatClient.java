package com.designpattern.behavioural.mediator.test;

import com.designpattern.behavioural.mediator.ChatMediator;
import com.designpattern.behavioural.mediator.ChatMediatorImpl;
import com.designpattern.behavioural.mediator.User;
import com.designpattern.behavioural.mediator.UserImpl;
/**
 * 
 * @author pardeshi_n
 *Mediator Pattern Client
 *Let’s test this our chat application with a simple program where we will create mediator 
 *and add users to the group and one of the user will send a message.
 *Notice that client program is very simple and it has no idea how the message is getting handled 
 *and if mediator is getting user or not.
 */
public class ChatClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "AAA");
		User user2 = new UserImpl(mediator, "BBB");
		User user3 = new UserImpl(mediator, "CCC");
		User user4 = new UserImpl(mediator, "DDD");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
	}

}
