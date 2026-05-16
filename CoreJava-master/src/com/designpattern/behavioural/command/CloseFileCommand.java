package com.designpattern.behavioural.command;

public class CloseFileCommand implements Command {

	private FileSystemReceiver fileSystem;
	
	public CloseFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}
	
	@Override
	public void execute() {
		//open command is forwarding request to openFile method
		this.fileSystem.closeFile();
	}

}
