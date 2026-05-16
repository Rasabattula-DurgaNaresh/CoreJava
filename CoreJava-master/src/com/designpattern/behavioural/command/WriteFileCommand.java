package com.designpattern.behavioural.command;

public class WriteFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public WriteFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}
	
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.fileSystem.writeFile();
	}

}
