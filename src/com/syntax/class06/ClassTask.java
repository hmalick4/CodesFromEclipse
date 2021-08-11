package com.syntax.class06;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
/*
 * write a program to ask user to enter value for sale: yes or no.
 * if theres no sale--> you are not going shopping
 * if there is a sale--> ask the user for the price of the item.
 * based on the price you have to calculate the price of the item after the discount.
 * if price is less than $20, apply 10% discount
 * if price is between $20-$100, apply 20% discount
 * if price is between $100-$500, apply 30% discount
 * otherwise apply a 50% discount
 * 
 */
		Scanner scan=new Scanner(System.in);
		String sale, item;
		System.out.println("Is there a sale? Enter yes or no.");
		sale=scan.nextLine();
		
		if(sale.equals("yes")) {
		double price, discount, newPrice;
		discount=0;
		
		System.out.println("What are you purchasing?");
		item=scan.nextLine();
		
		System.out.println("What is the price of the item?");
		price=scan.nextDouble();
		
		if(price<20) {
			discount=price*.1;
		}else if(price<=20 && price>100) {
			discount=price*.2;
		}else if(price<=100 && price>500) {
			discount=price*.3;
		}else if(price>500) {
			discount=price*.5;
		}
		newPrice=price-discount;
		System.out.println("After discount " +discount+ " the price of the item reduced from $"+price +" to $" +newPrice);
		
	} else {
		System.out.println("We are not going shopping.");
	}
	} }

