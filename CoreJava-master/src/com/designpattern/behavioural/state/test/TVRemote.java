package com.designpattern.behavioural.state.test;

import com.designpattern.behavioural.state.State;
import com.designpattern.behavioural.state.TVContext;
import com.designpattern.behavioural.state.TVStartState;
import com.designpattern.behavioural.state.TVStopState;
/**
 * 
 * @author pardeshi_n
 *Output of above program is same as the basic implementation of TV Remote without using any pattern.
 *
 */
public class TVRemote {
	 public static void main(String[] args) {
		 TVContext context = new TVContext();
		 State tvStartState = new TVStartState();
		 State tvStopState = new TVStopState();
		 
		 context.setTvState(tvStartState);
		 context.doAction();
		 
		 context.setTvState(tvStopState);
		 context.doAction();
	 }
}
