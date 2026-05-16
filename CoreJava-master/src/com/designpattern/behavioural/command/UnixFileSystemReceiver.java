package com.designpattern.behavioural.command;
/**
 * 
 * @author pardeshi_n
 *Receiver Classes
 *FileSystemReceiver interface defines the contract for the implementation classes. 
 *For simplicity, I am creating two flavors of receiver classes to work with Unix and Windows systems.
 */
public class UnixFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Opening file in unix OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in unix OS");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in unix OS");
	}

}
