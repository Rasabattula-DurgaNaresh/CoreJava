package com.designpattern.behavioural.memento;
/**
 * 
 * @author pardeshi_n
 *Notice the Memento inner class and implementation of save and undo methods. 
 */
public class FileWriterUtil {
	private String fileName;
	private StringBuilder content;
	public FileWriterUtil(String fn) {
		this.fileName = fn;
		this.content = new StringBuilder();
	}
	@Override
	public String toString() {
		return this.content.toString();
	}
	public void write(String str) {
		content.append(str);
	}
	public Momento save() {
		return new Momento(fileName, content);
	}
	public void undoLastSave(Object obj) {
		Momento momento = (Momento)obj;
		this.fileName = momento.fileName;
		this.content = momento.content;
	}
	
	private class Momento {
		private String fileName;
		private StringBuilder content;
		public Momento(String fn, StringBuilder content) {
			this.fileName = fn;
			//notice the deep copy so that Memento and FileWriterUtil content 
			//variables don't refer to same object.
			this.content = new StringBuilder();
		}
	}
	
}
