package com.designpattern.behavioural.iterator;
/**
 * 
 * @author pardeshi_n
 *ChannelCollection interface defines the contract for our collection class implementation. 
 *Notice that there are methods to add and remove a channel 
 *but there is no method that returns the list of channels 
 *and it has a method that returns the iterator for traversal.
 */
public interface ChannelCollection {
	public void addChannel(Channel channel);
	public void removeChannel(Channel channel);
	public ChannelIterator iterator(ChannelTypeEnum type);
}
