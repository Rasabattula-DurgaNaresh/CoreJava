package com.designpattern.behavioural.state;
/**
 * 
 * @author pardeshi_n
 *Notice that client code should know the specific values to use for setting the state of remote, 
 *further more if number of states increase then the tight coupling between implementation 
 *and the client code will be very hard to maintain and extend.
 */
public class TVRemoteBasic {
	private String state = null;

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	public void doAction() {
		if(state.equalsIgnoreCase("ON")) {
			System.out.println("TV is turned ON");
		} else if(state.equalsIgnoreCase("OFF")) {
			System.out.println("TV is turned OFF");
		}
	}
	private static void main(String args[]) { {
		TVRemoteBasic remote = new TVRemoteBasic();
		remote.setState("ON");
		remote.doAction();
		
		remote.setState("OFF");
		remote.doAction();
	}
		
	}
}
