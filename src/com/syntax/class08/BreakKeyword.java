package com.syntax.class08;

import java.util.Scanner;

public class BreakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String answer;
		do {
			System.out.println("Do you want to apply for Credit? ");
			answer=scan.nextLine();
		} while (!answer.equals("yes"));
		  System.out.println("Thank you for finaly Deciding");
		
		boolean summer=true;
		int temp=80;
		
			while(summer) {
				if (temp>95) {
					System.out.println("I do not love a hot summer.");
					break;
				}
				System.out.println("I love the summer.");
				temp+=2;
			}
	}

}
