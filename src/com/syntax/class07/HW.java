package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * task 1.  find teh sum of even and odd numbers from 1-100
		 */
		
			int evenSum=0;
			int oddSum=0;
			int num=0;
			for (num=1; num<=100; num++) {
				if (num%2==0) {
				evenSum+=num;
				} else {
					oddSum+=num;
					
				}
			}
			System.out.println("Sum of even numbers from 1 to 100 is " + evenSum);
			System.out.println("Sum of odd numbers from 1 to 100 is " + oddSum);
			/*
		}
		
		
		/*
		 * task 2. ask user to pay for a candy bar.
		 * keep asking user to pay for the candy until the entered price is not equal to 3.
		 * if the user's value is more than 3, say "please give less money"
		 * if the user's value is less than 3, say "please give more money"
		 * after user gives correct amount, say "please enjoy your candy"
		 */
			Scanner scan=new Scanner(System.in);
			
			System.out.println("How much money do you have for your candy?");
			int money;
			
			do {
				System.out.println("Please pay for your candy");
				money=scan.nextInt();
			
				if(money>3) {
					System.out.println("Please give less money");
				}else if(money<3) {
					System.out.println("Please give more money");
				}
			}while(money!=3);
			System.out.println("Enjoy your candy!");
	}
	}

