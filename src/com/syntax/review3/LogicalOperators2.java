package com.syntax.review3;

public class LogicalOperators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 /* if a number is from 0 to 100 print number is in range
		 * else print number is out of range
		*/
		
		int number=-10;
		
		if(number>=0) {
			if(number<=100) {
				System.out.println("number is in range");
			}else {
				System.out.println("number is out of range");
			}
		}else {
				System.out.println("number is out of range");
			} 
			
			
		//easier and cleaner method below.
		
		if(number>=0 && number<=100) {
			System.out.println("number is in range");
		}else {
			System.out.println("number is out of range");
		}
	}
	} 




