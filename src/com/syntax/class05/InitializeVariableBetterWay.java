package com.syntax.class05;

import java.util.Scanner;

public class InitializeVariableBetterWay {
	

	public static void main(String[]args) {

	
	/*
	 * ask user to enter three different numbers
	 * then find the largest number
	 */
	
	Scanner scan;
	int num1, num2, num3, largest;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter three numbers.");
	num1=scan.nextInt();
	num2=scan.nextInt();
	num3=scan.nextInt();
	
	if (num1>num2 && num1>num3) {
		largest=num1;
	} else if (num2>num1 && num2>num3) {
		largest=num2;
	} else {
		largest=num3;
	}
	System.out.println("The largest number is "+largest);


	//lets identify if the largest number is even or odd
	
	if (largest%2!=0) {
		System.out.println(largest +" is odd.");
	}else {
		System.out.println(largest +" is even.");
	}
	






}
}
