package com.syntax.class04;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {

		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed.
		 *  If loan is less or equal to 200,000 then you would lend the money.
		 *   otherwise you would reject the client.
		 */
		
	Scanner scan=new Scanner(System.in);
	System.out.println("How much money do you need to borrow?");
	int loanAmount=scan.nextInt();
	if (loanAmount<=200000) {
		System.out.println("You may borrow money.");
	} else {
		System.out.println("You may not borrow money.");
	}
	
	
	
	}
}
