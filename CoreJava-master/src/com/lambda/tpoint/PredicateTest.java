package com.lambda.tpoint;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		eval(list, n -> true);
		System.out.println("Print even numbers:");
		eval(list, n -> n%2 == 0);
		System.out.println("Print odd numbers:");
		eval(list, n -> n%2 != 0);
		System.out.println("Print numbers greater than 3:");
		eval(list, n -> n > 3);
		
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		Predicate<String> startsWithJ = l -> l.startsWith("J");
		Predicate<String> fourLetterLong = f -> f.length() == 4;
		System.out.println(startsWithJ);
		
		languages.stream().filter(startsWithJ.and(fourLetterLong)).forEach(l -> System.out.println(l));
	}
	
	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		/*for(Integer n: list) {
			if(predicate.test(n)) {
				System.out.println(n+ " ");
			}
		}*/
		
		list.stream().filter(n -> predicate.test(n)).forEach(n -> System.out.println(n));
	}

}
