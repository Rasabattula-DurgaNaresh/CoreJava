package com.lambda.java8lambda.dto;

public class Track {
	private String trackName;
	private int length;
	
	public Track(String trackname, int length) {
		this.trackName = trackname;
		this.length = length;
	}
	/**
	 * @return the trackName
	 */
	public String getTrackName() {
		return trackName;
	}

	/**
	 * @param trackName the trackName to set
	 */
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString() {
		return trackName+" "+length;
	}
}
