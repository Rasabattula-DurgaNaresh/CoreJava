package com.designpattern.behavioural.command.test;

import com.designpattern.behavioural.command.CloseFileCommand;
import com.designpattern.behavioural.command.FileInvoker;
import com.designpattern.behavioural.command.FileSystemReceiver;
import com.designpattern.behavioural.command.FileSystemReceiverUtil;
import com.designpattern.behavioural.command.OpenFileCommand;
import com.designpattern.behavioural.command.WriteFileCommand;
/**
 * 
 * @author pardeshi_n
 *Notice that client is responsible to create the appropriate type of command object, 
 *for example if you want to write a file you are not supposed to create CloseFileCommand object. 
 *Client program is also responsible to attach receiver to the command 
 *and then command to the invoker class.
 */
public class FileSystemClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
         
        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
         
        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);
         
        //perform action on invoker object
        file.execute();
         
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();
         
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
	}

}
