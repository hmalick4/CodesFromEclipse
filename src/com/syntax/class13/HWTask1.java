package com.syntax.class13;

public class HWTask1 {


	//1. create a method that will take 2 parameters as a number and prints which number is larger.
	

	
	void printGreater(int a, int b) {
		if(a<b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
		//2. create a method that will take a number
		//and prints whether the number is even or odd.
	
	void oddOrEven(int c) {
		if(c%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd.");
		}
	}

		
		/*
		 * 3. create a method that will say Hello in different languages based on the country
		 * that will be passed when the method is executed.
		 */
		
	
	void printHello (String country) {
		switch(country) {
		case "USA":
		System.out.println("watsup");
		break;
		case "Spain":
			System.out.println("hola");
		break;
		case "Pakistan":
			System.out.println("salaam");
		break;
		case "Italy":
			System.out.println("ciao");
		break;
		default:
			System.out.println("invalid");
		
		}
	}
	
	
	
	
		
		
		/*
		 * 4. create a method createEmail().
		 * based on values of users name, lastName, and email type, 
		 * your method should return complete email address ex johnsnow@gmail.com
		 */

		String createEmail(String firstName,String lastname,String emailtype) {
			return firstName+lastname+"@"+emailtype+".com";
			}
		
		
		/*
		 * write a method to return whether a given number is prime or not.
		 */
	
		
		boolean prime(int number) {
			if(number>1) {
				for(int i=2; i<number; i++) {
					if(number%i==0) {
						return false;
					}
				}
				}else {
					return false;
				}
				return true;
			}
		
		/*
		 * create class student that will have a method getGrade. your method
		 * should accept the score of a student and return a grade.
		 */
		
		char getGrade(double score) {
			if(score>90) {
				return 'A';
			}else if(score>80) {
				return 'B';
			}else if(score>70) {
				return 'C';
			}else if(score>60) {
				return 'D';
			}else {
				return 'F';
			}
		}
	
}
