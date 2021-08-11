package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write a program to ask if user got a visa
		//if user got a visa, ask how long visa is for
		//if visa is is more than one year, say cool. if less, say go back in one year
		
		Scanner scan;
		String visa;
		int years;
		
		scan=new Scanner (System.in);
		System.out.println("Did you get your visa?");
		visa=scan.next();
		
		if(visa.equals("yes")) {
			System.out.println("Congrats, how long is your visa for?");
			
			years=scan.nextInt();
			
			if (years>1) {
				System.out.println("That is awesome");
			}else {
				System.out.println("You will go back in one year and apply again.");
			}
		}
	}

}
