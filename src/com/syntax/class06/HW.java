package com.syntax.class06;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * task 1: Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		String country, language;
		
		System.out.println("What country are you from?");
		country=scan.nextLine();
		
		switch (country) {
			case "USA":
			language="English";
			break;
			
			case "Mexico":
			language="Spanish";
			break;
			
			case "Pakistan":
			language="Urdu";
			break;
		
			case "Italy":
			language="Italian";
			break;
			
			default:
			language="invalid";
		}
		
		System.out.println("You are from " +country +" and your traditional language is " +language +".");
		
		
		System.out.println("------task2-------");
		
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		
		String grade, explanation;
		
		System.out.println("What letter grade did you earn?");
		grade=scan.nextLine();
		
		switch (grade) {
			case "A":
			explanation="Excellent";
			break;
			
			case "B":
				explanation="Good";
				break;
				
			case "C":
				explanation="Average";
				break;
				
			case "D":
				explanation="Bad";
				break;
				
			default:
				explanation="unacceptable";
		}
			System.out.println("You earned an "+grade+" which is "+explanation);
			
			System.out.println("--------task3A------");
			/*
			 * task 3
			 * Using scanner class, create a calculator.
			 * Allow user to enter 2 numbers and operator(+,-,*,/). 
			 * Based on operator provide the result to user.
			 * complete assignment in two ways: if statement and switch case
			 */
	
			System.out.println("Enter two numbers.");
			double num1=scan.nextDouble();
			double num2=scan.nextDouble();
	
			System.out.println("Please enter an operator.");
			char operator=scan.next().charAt(0);
			double result=0.0;
			
			if(operator=='+') result=num1+num2;
			else if (operator=='-') result=num1-num2;
			else if (operator=='*') result=num1*num2;
			else if (operator=='/') result=num1/num2;
			
			System.out.println("Your result is " +result);
					
			System.out.println("----------task3B-------");
	
			System.out.println("Enter two numbers.");
			double number1=scan.nextDouble();
			double number2=scan.nextDouble();
			
			System.out.println("Please enter an operator.");
			char opper=scan.next().charAt(0);
			double resultt=0.0;
			
			switch (opper) {
				case '+':
				resultt=number1+number2;
				break;
				
				case '-':
				resultt=number1=number2;
				break;
				
				case '*':
				resultt=number1*number2;
				break;
				
				case '/':
				resultt=number1/number2;
				break; 
				}
			
			System.out.println("Your result is "+resultt);
			
	
		
	}
		
		
		}
