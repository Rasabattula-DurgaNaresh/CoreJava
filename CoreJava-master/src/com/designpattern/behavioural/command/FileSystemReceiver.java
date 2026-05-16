package com.designpattern.behavioural.command;
/**
 * 
 * @author pardeshi_n
 *Receiver Classes
 *FileSystemReceiver interface defines the contract for the implementation classes. 
 *For simplicity, I am creating two flavors of receiver classes to work with Unix and Windows systems.
 */
public interface FileSystemReceiver {
	void openFile();
    void writeFile();
    void closeFile();
}
