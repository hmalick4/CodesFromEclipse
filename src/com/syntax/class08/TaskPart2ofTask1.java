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
		
		
		Scanner scan=new Scanner (System.in);
		int startNum, endNum, oddSum=0, evenSum=0;
		
		System.out.println("Enter a start point");
		startNum=scan.nextInt();
		System.out.println("Enter an end point ");
		endNum=scan.nextInt();
		
		for(int i=startNum; i<=endNum; i++) {
			if(i%2==0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		
			
		System.out.println("The sum of even numbers between "+startNum+" and "+endNum+" is "+evenSum +".");
		System.out.println("The sum of odd numbers between "+startNum+" and "+endNum+" is "+oddSum +".");
		
		

		
		
		
		
	}

}
