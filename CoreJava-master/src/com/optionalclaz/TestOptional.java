package com.optionalclaz;

import java.util.Optional;

public class TestOptional {
	public static void main(String [] args) {
		Optional<Integer> i = Optional.empty();
		System.out.println(i);
		//Below statement throws NPE immediately.
	//	Optional<Integer> possible = Optional.of(null);
		Optional<Integer> possible = Optional.ofNullable(null);
		System.out.println(possible);
		Optional<Integer> i1 = Optional.ofNullable(5);
		System.out.println(i1);
		
		Optional<Integer> i2 = Optional.of(5);
		if(i2.isPresent()) {
			System.out.println(i2.get());
		};
		
		Integer i3 = i2.orElse(new Integer(6));
		System.out.println(i2+" : "+i3);
		
	//	Integer i4 = i2.orElseThrow(new IllegalStateException());
		
	}
}
