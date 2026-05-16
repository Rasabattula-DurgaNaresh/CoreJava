package com.designpattern.structural.proxy.test;

import com.designpattern.structural.proxy.CommandExecutor;
import com.designpattern.structural.proxy.CommandExecutorProxy;

public class ProxyPatternTest {
	 public static void main(String[] args){
	        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
	        try {
	            executor.runCommand("ls -ltr");
	            executor.runCommand("rm -rf abc.pdf");
	        } catch (Exception e) {
	            System.out.println("Exception Message::"+e.getMessage());
	        }
	    }
}
