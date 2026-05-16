package com.designpattern.behavioural.state;
/**
 * 
 * @author pardeshi_n
 *Implement our Context object that will change it’s behavior based on it’s internal state.
 *Notice that Context also implements State and keep a reference of it’s current state 
 *and forwards the request to the state implementation.
 */
public class TVContext implements State {
	private State tvState;

	/**
	 * @return the tvState
	 */
	public State getTvState() {
		return tvState;
	}
	/**
	 * @param tvState the tvState to set
	 */
	public void setTvState(State tvState) {
		this.tvState = tvState;
	}

	@Override
	public void doAction() {
		this.tvState.doAction();
	}

}
