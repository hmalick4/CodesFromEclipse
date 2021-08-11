package com.syntax.class05;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program that will read three inputs of scores 
 * (quiz, mid term, and final scores) and determine the grade based on the following rules:
 * if the average score >=90 → grade=A
 * if the average score >= 70 and <90 → grade=B
 * if the average score>=50 and <70 → grade=C
 * if the average score<50 → grade=F
 */



 
Scanner scan;
		int quiz, midterm, overall, average;
		char grade=0;
		
		scan=new Scanner(System.in);
		System.out.println("Enter quiz score");
		quiz=scan.nextInt();
		System.out.println("Enter midterm score");
		midterm=scan.nextInt();
		System.out.println("Enter final score");
		overall=scan.nextInt();
		
		average=(quiz+midterm+overall)/(3);
		
		if (average >=90) {
			grade='A';
		} else if (average>=70 && average<90) {
			grade='B';
		}else if (average>=50 && average<70) {
			grade='C';
		}else if (average <50) {
			grade='F';
		}
		System.out.println("You earned an " +grade +".");
		
		/*
		 * 2. Write a program for user to enter his/hers birth month. 
		 * Based on the month define the season.
		 * example: if user is born in June, July or August → season =“Summer”.
		 * At the end of the program we should see output as “You were born is season ______“.
		 */
	
		System.out.println("-----------TASK 2------------------");
		scan = new Scanner(System.in);
		String month;
		System.out.println("What is your birth month?");
		month=scan.nextLine();
		
		if (month.equals("January") || month.equals("February") || month.equals("March")) {
			System.out.println("You were born in the winter.");
		} else if (month.equals("April") || month.equals("May") || month.equals("June")) {
			System.out.println("You were born in the spring.");
		} else if (month.equals("July") || month.equals("August") || month.equals("September")) {
			System.out.println("You were born in the fall");
		}else if (month.equals("October") || month.equals("November") || month.equals("December")) {
			System.out.println("You were born in the winter.");
				
		
		/*
		 * task number 3
		 * 3. Write a program to find largest number among three numbers using 
		 * nested if provided by a user (numbers must be distinct)
		 */
		
			System.out.println("--------TASK 3 ------------------");
			scan = new Scanner(System.in);
			int A, B, C, largest;
			System.out.println("Enter three distinct numbers.");
			A=scan.nextInt();
			B=scan.nextInt();
			C=scan.nextInt();
			
			if (A>B && A>C) {
				largest=A;
			} else if (B>A && B>C) {
				largest=B;
			} else {
				largest=C;
			}
			System.out.println("The largest number is" +largest);
	}
}	}	

