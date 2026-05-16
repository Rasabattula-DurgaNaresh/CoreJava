package com.designpattern.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author pardeshi_n
 *Concrete Mediator
 *Now we will create concrete mediator class, it will have a list of users 
 *in the group and provide logic for the communication between the users.
 */
public class ChatMediatorImpl implements ChatMediator {

	private List<User> userList;
	public ChatMediatorImpl() {
		userList = new ArrayList<User>();
	}
	@Override
	public void sendMessage(String message, User user) {
		for(User u: userList) {
			//message should not be received by the user sending it
			if(u != user) {
				u.receive(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.userList.add(user);
	}

}
