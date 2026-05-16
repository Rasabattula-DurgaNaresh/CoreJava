package com.lambda.java8lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.lambda.java8lambda.dto.Track;

public class MaxMinTest {

	public static void main(String[] args) {
		List<Track> tracks = Arrays.asList(new Track("Bakai", 524),
				new Track("Violets for Your Furs", 378),
				new Track("Time Was", 451));
		
		//Get The shortest track
		Track shortestTrack = tracks.stream().min(Comparator.comparing(track -> track.getLength())).get();
		System.out.println(shortestTrack);
	}

}
