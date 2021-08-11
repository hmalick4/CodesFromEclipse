package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				boolean understandJava=true;
				boolean enjoy=true;
				
				if(understandJava && enjoy) {
					System.out.println("That is awesome.");
				}else {
					System.out.println("Please try to spend more time with Java");
				}
				
				/* 
				 * declare a number
				* if a number is larger than 1 but smaller than 10--> small
				* 10-100 ---> medium
				* 100-1000 ---> large
				*/ 
				
				int num=5400;
				if (num>0) {
				
					if (num>=1 && num<10) {
						System.out.println("Number is small.");
					} else if (num>=10 && num<100) {
						System.out.println("Number is medium.");
					} else if (num>=100 && num<1000) {
						System.out.println("Number is large");
					} else {
						System.out.println("Number is HUGE");
					}
				} else {
						System.out.println("Number is either 0 or negative.");
		
	}
	}
}
