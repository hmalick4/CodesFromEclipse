package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, 
		 * anyday from 6-7 → output “It is a weekend”, 
		 * any other day → output “Invalid day"
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the day of the week as a digit.");
		int day=scan.nextInt();

		if (day==2 || day==3 || day==4 || day==5 || day==6) {
			System.out.println("It is a weekday.");
		}else if (day==1 || day==7) {
			System.out.println("It is the weekend.");
		} else {
			System.out.println("Invalid day.");
			
			//can also show day as (day>1 && day<6)
	


		}
		
	}

}
