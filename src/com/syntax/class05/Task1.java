package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Prompt the user to enter person heights in inches. 
		 * Person should be classified as one of the following:
		 * short (under 60 inches)
		 * medium (between 60-72 inches)
		 * tall (over 72 inches)
		 */
		
				
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your height in inches?");
		int height = scanner.nextInt();
		String userName=scanner.nextLine();
		if (height <60) {
			System.out.println("You are short.");
		}else if (height>= 60 && height <72) {
			System.out.println("You are of medium height.");
		}else if (height >72) {
			System.out.println("You are tall.");
		}
	}

}
