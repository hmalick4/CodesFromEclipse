package com.syntax.class07;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * we have a secret number from (any number from 1 til 20).
		 * ask user to guess the secret number.
		 * continuously guess until you get the correct number.
		 * once guess is correct, lets say congrats.
		 */
		
		Scanner scan =new Scanner(System.in);
		int secretNumber, userNumber;
		secretNumber=14;
		
		do {
		System.out.println("Please guess my secret number from 1-20.");
				userNumber=scan.nextInt();
		}while(userNumber!=secretNumber); 
		//dont know in advance how many times you need the block of code so use do while. trust and then verify
		//while makes you verify first and then execut
		
		System.out.println("congrats! you got it correct");
		
		
	}

}
