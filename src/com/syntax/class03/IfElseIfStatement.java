package com.syntax.class03;

public class IfElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//what is teh largest number
		
		int num1=20;
		int num2=20; //reassign to test what will print as an exercise
		
		if (num1>num2) {
			System.out.println(num1 +"is larger than" +num2);
		} else if (num1<num2) {
			System.out.println(num1+ " is smaller than" +num2);
		} else {
			System.out.println(num1 + " is equal to" +num2);
		}
			System.out.println("____________________");
			/*
			 * declare a variable day and then based on the day value, 
			 * provide output such as today is monday, today is tuesday
			 */
			
			int day=6;
			
			if (day==1) {
				System.out.println("Today is Monday");
			}else if (day==2) {
				System.out.println("Today is Tuesday");
			}else if (day==3) {
				System.out.println("Today is Wednesday");
			}else if (day==4) {
				System.out.println("Today is Thursday");
			}else if (day==5) {
				System.out.println("Today is Friday");
			}else if (day==6) {
				System.out.println("Today is Saturday");
			}else if (day==7) {
				System.out.println("Today is Sunday");
	}
		}
}