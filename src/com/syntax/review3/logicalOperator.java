package com.syntax.review3;

public class logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * logical operators in java are && || and !
		 * we can use these operators to put multiple conditions in the if block
		 */
		
		
		String day="Monday";
		if ("Sunday".equals(day)) {
			System.out.println("It is the weekend.");
		} else if (day.equals("Saturday")) {
			System.out.println("It is the weekend.");
		} else {
			System.out.println("It is a weekday.");
		}
	
		int number=10;
		if (number==10) {
			System.out.println("Number is 10");
		}
		if(10==number) {
			System.out.println("Number is 10");
		}
		//another way using logical operators
		
		if(day.equals("Sunday") |day.equals("Saturday")) {
			System.out.println("its the weekend.");
		}else {
			System.out.println("its the weekday.");
		}
		
		
	}
	

}
