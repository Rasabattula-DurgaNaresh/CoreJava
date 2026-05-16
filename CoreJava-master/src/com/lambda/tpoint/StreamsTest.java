package com.lambda.tpoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsTest {

	public static void main(String[] args) {
		System.out.println("Using Java 7: ");
		
		 // Count empty strings
		 List<String> strings = Arrays.asList("abc", "", "bc", "efg", "", "abcd","", "jkl");
		 System.out.println("List: " +strings);
		 long count = getCountEmptyStringUsingJava7(strings);
		 System.out.println("Empty Strings: " + count);
		 
		 count = getCountLength3UsingJava7(strings);
			
	     System.out.println("Strings of length 3: " + count);
	     
	   //Eliminate empty string
	      List<String> filtered = deleteEmptyStringsUsingJava7(strings);
	      System.out.println("Filtered List: " + filtered);
	      
	    //Eliminate empty string and join using comma.
	      String mergedString = getMergedStringUsingJava7(strings,", ");
	      System.out.println("Merged String: " + mergedString);
	      
	      List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	      //get list of square of distinct numbers
	      List<Integer> squaresList = getSquares(numbers);
	      System.out.println("Squares List: " + squaresList);
	      
	      List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
			
	      System.out.println("List: " +integers);
	      System.out.println("Highest number in List : " + getMax(integers));
	      System.out.println("Lowest number in List : " + getMin(integers));
	      System.out.println("Sum of all numbers : " + getSum(integers));
	      System.out.println("Average of all numbers : " + getAverage(integers));
	      
	      System.out.println("Random Numbers: ");
	      Random random = new Random();
	      for(int i = 0 ; i < 10 ; i++) {
	    	  System.out.println(random.nextInt());
	      }
	      
	      System.out.println("Using Java 8: ");
	      System.out.println("List: " +strings);
	      
	      count = strings.stream().filter(str -> str.isEmpty()).count();
	      System.out.println("Empty Strings: " + count);
	      
	      filtered = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
	      System.out.println("Filtered List: " + filtered);
	      
	      random.ints().limit(10).forEach(System.out::println);
	      
	      mergedString = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(", "));
	      System.out.println("Merged String: " + mergedString);
	      
	      squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
	      System.out.println("Squares List: " + squaresList);
	      
	      System.out.println("Numbers : "+numbers);
	      IntSummaryStatistics stats = numbers.stream().mapToInt(n -> n).summaryStatistics();
	      System.out.println("Highest number in List : " + stats.getMax());
	      System.out.println("Lowest number in List : " + stats.getMin());
	      System.out.println("Sum of all numbers : " + stats.getSum());
	      System.out.println("Average of all numbers : " + stats.getAverage());
	      
	}

	public static long getCountEmptyStringUsingJava7( List<String> strings) {
		int count = 0;
		for(String str: strings) {
			if(str.isEmpty()) {
				count++;
			}
		}
		return count;
	}
	
	private static int getCountLength3UsingJava7(List<String> strings){
	      int count = 0;
			
	      for(String string: strings){
			
	         if(string.length() == 3){
	            count++;
	         }
	      }
	      return count;
	   }
	
	private static List<String> deleteEmptyStringsUsingJava7(List<String> strings){
		List<String> filteredList = new ArrayList<String>();
		for(String str: strings) {
			if(!str.isEmpty()) {
				filteredList.add(str);
			}
		}
		return filteredList;
	}
	
	private static String getMergedStringUsingJava7(List<String> strings, String separator){
		 StringBuilder stringBuilder = new StringBuilder();
			
	      for(String string: strings){
			
	         if(!string.isEmpty()){
	            stringBuilder.append(string);
	            stringBuilder.append(separator);
	         }
	      }
	      String mergedString = stringBuilder.toString();
		return mergedString.substring(0, mergedString.length()-2);
		
	}
	
	 private static List<Integer> getSquares(List<Integer> numbers){
		 List<Integer> squaresList = new ArrayList<Integer>();
		 for(Integer number: numbers) {
			 Integer square = new Integer(number.intValue() * number.intValue());
			 if(!squaresList.contains(square)){
		            squaresList.add(square);
		     }
		 }
		return squaresList;
		 
	 }
	 
	 private static int getMax(List<Integer> numbers){
		 int max = numbers.get(0);
		 for(int i = 1 ; i < numbers.size() ; i++) {
			 if(numbers.get(i) > max) {
				 max = numbers.get(i);
			 }
		 }
		 return max;
	 }
	 
	 private static int getMin(List<Integer> numbers){
		 int max = numbers.get(0);
		 for(int i = 1 ; i < numbers.size() ; i++) {
			 if(numbers.get(i) < max) {
				 max = numbers.get(i);
			 }
		 }
		 return max;
	 }
	 
	 private static int getSum(List<Integer> numbers){
		 int sum = numbers.get(0);
		 for(int i = 1 ; i < numbers.size() ; i++) {
			 sum += numbers.get(i);
		 }
		 return sum;
	 }
	 
	 private static int getAverage(List<Integer> numbers){
		 return getSum(numbers)/numbers.size();
	 }
}
