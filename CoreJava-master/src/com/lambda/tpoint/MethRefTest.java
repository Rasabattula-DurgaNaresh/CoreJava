package com.lambda.tpoint;

import java.util.ArrayList;
import java.util.List;

public class MethRefTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("AAA");
		names.add("BBB");
		names.add("CCC");
		names.add("DDD");
		
		names.forEach(System.out::println);
		
	}

}
