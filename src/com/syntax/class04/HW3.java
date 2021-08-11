package com.syntax.class04;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 */
	
		System.out.println("What city are you from?");
		Scanner scan=new Scanner(System.in);
		String city=scan.nextLine();
		
		System.out.println("What is the current temperature in Farenheit?");
		int temp=scan.nextInt();
		int tempC=(temp-32)*5/9;
		
		System.out.println("The temperature in "+city +" is "+tempC +" C.");
		
	}

}
