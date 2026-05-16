package com.designpattern.behavioural.iterator;
/**
 * 
 * @author pardeshi_n
 *Channel is a simple POJO class that has attributes frequency and channel type.
 */
public class Channel {
	private double frequency;
	private ChannelTypeEnum TYPE;
	public Channel(double freq, ChannelTypeEnum type) {
		this.frequency = freq;
		this.TYPE = type;
	}
	/**
	 * @return the frequency
	 */
	public double getFrequency() {
		return frequency;
	}
	/**
	 * @return the tYPE
	 */
	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}
	@Override
	public String toString() {
		return "Frequency "+frequency+" , Channel Type "+TYPE;
	}
}
