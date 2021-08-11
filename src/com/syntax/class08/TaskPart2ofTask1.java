package com.syntax.class08;

import java.util.Scanner;

public class TaskPart2ofTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Write a program that reads a range of integers from (start and end point),
		 * provided by a user.
		 * Then from that range, print the sum of the even and odd integers.
		 */
		
		int start, end, evenSum=0, oddSum=0;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two numbers.");
		start=scan.nextInt();
		end=scan.nextInt();
	
		for(int i=start; i<=end; i++ ) {
			if (i%2==0) {
				evenSum+=i;
				
			}else {
				oddSum+=i;
			}
		}
		System.out.println("Sum of even numbers from " +start+" til " +end+" equals "+evenSum);	
		System.out.println("Sum of odd numbers from " +start+" til "+end+" equals "+oddSum);
	}

}
