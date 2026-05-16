package com.designpattern.structural.proxy;
/**
 * 
 * @author pardeshi_n
 *Since we code Java in terms of interfaces, here is our interface and its implementation class.
 *
 */
public interface CommandExecutor {
	public void runCommand(String cmd) throws Exception;
}
