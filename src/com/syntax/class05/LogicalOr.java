package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * define a day
		 * if monday or friday--no class
		 * if day is Tues or Wed--manual class
		 * if thurs--review
		 * if sat or sun--java
		 */
		
		String day="Tuesday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
		System.out.println("We have no class");
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today is manual class.");
		} else if (day.equals("Thursday")) {
			System.out.println("Today is our review class");
		} else if (day.equals("Saturday") || day.equals("Sunday")){
			System.out.println("Today is java class.");
			
		} else {
			System.out.println("Please specify valid day.");
		}
		
	}

}
