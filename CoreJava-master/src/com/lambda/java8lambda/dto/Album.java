package com.lambda.java8lambda.dto;

import java.util.List;

public class Album {
	private String albumName;
	private List<Track> tracklist;
	private List<Artist> artistList;
	/**
	 * @return the albumName
	 */
	public String getAlbumName() {
		return albumName;
	}
	/**
	 * @param albumName the albumName to set
	 */
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	/**
	 * @return the tracklist
	 */
	public List<Track> getTracklist() {
		return tracklist;
	}
	/**
	 * @param tracklist the tracklist to set
	 */
	public void setTracklist(List<Track> tracklist) {
		this.tracklist = tracklist;
	}
	/**
	 * @return the artistList
	 */
	public List<Artist> getArtistList() {
		return artistList;
	}
	/**
	 * @param artistList the artistList to set
	 */
	public void setArtistList(List<Artist> artistList) {
		this.artistList = artistList;
	}
	
	
}
