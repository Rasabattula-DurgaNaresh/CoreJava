package com.lambda.tpoint.datetimeutil;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestPeriodAndDuration {
	public static void main(String[] args) {
		  //Get the current date
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);
			
	      //add 1 month to the current date
	      LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
	      System.out.println("Next month: " + date2);
	      
	      Period period1 = Period.between(date1, date2);
	      System.out.println("Period1: " + period1);
	      
	      Period period2 = Period.between(date2, date1);
	      System.out.println("Period2: " + period2);
	      
	      LocalTime time1 = LocalTime.now();
	      Duration twoHours = Duration.ofHours(2);
			
	      LocalTime time2 = time1.plus(twoHours);
	      Duration duration = Duration.between(time1, time2);
			
	      System.out.println("Duration: " + duration);
	}
}
