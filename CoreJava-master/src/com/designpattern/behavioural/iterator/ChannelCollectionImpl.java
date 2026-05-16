package com.designpattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author pardeshi_n
 *Notice the inner class implementation of iterator interface so that the 
 *implementation can’t be used by any other collection. 
 *Same approach is followed by collection classes also and all of them have inner class implementation 
 *of Iterator interface.
 */
public class ChannelCollectionImpl implements ChannelCollection {
	private List<Channel> channelsList;
	public ChannelCollectionImpl() {
		channelsList = new ArrayList<Channel>();
	}

	@Override
	public void addChannel(Channel channel) {
		this.channelsList.add(channel);
	}

	@Override
	public void removeChannel(Channel channel) {
		this.channelsList.remove(channel);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, channelsList);
	}
	
	//Inner class is created
	private class ChannelIteratorImpl implements ChannelIterator {
		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;
		public ChannelIteratorImpl(ChannelTypeEnum ty, List<Channel> ch) {
			this.type = ty;
			this.channels = ch;
		}
		@Override
		public boolean hasNext() {
			while(position < channels.size()) {
				Channel c = channels.get(position);
				if(c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
					return true;
				} else {
					position++;
				}
			}
			return false;
		}

		@Override
		public Channel next() {
			Channel c = channels.get(position);
			position++;
			return c;
		}
		
	}

}
