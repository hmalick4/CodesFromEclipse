package com.syntax.class04;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your age?");
		int age=scan.nextInt();
		
		if (age>18) {
			System.out.println("You may get a driver's license.");
	} else {
		System.out.println("You may get a learners permit");
	}

} }
