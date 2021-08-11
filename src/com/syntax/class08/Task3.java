package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * write a progarm to ask a user to enter an item they want to buy and the price of that item. 
		 * every time the user enters money, accumulate the amount 
		 * and tell teh user how much is left to pay off.
		 * if a user gives more money, the program should return with change.
		 * when a user is done with payments, program should say "thank you for shopping."
		 */
		
		Scanner scan=new Scanner(System.in);
		String item;
		double price, payment, total=0, change;
		
		System.out.println("What are you purchasing?");
		item=scan.next();
		System.out.println("How much does this "+item+" cost?");
		price=scan.nextDouble();
		
		do {
			
			System.out.println("Please pay for the item.");
			payment=scan.nextDouble();
			total+=payment;
			
			if(total>price) {
				change=total-price;
				System.out.println("Here is your change of $"+change);
				break;
			}else if (total<price) {
				System.out.println("Please give $"+(price-total)+ " more.");
			} else {
				System.out.println("Exact amount.");
			}
	
		} while (total<price);
		
		System.out.println("Thank you for shopping with us.");
	}

}
