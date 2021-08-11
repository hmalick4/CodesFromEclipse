package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//i want to print how are you
		
		System.out.println("print hey 10 times");
		int i=0;
		while (i<10) {
			System.out.println("hey");
			i++;
		}
		
		
		System.out.println("print numbers 1-20");
		int j=1; //declare variable
		
		while (j<=20) { //check condition
			System.out.println(j); //print value of variable
			j++;
		}
		System.out.println("I want to print from 100 to 110");
		int y=100;
		while (y<=110) {
			System.out.print(y +" "); //on one line and with a space
			y++;
		}
		
		System.out.println(" I want to print numbers from 10 to 1 ");
		int num=10;
		while(num>=1) {
			System.out.println(num);
			num--;
		}
		
		System.out.println("I want to print odd numbers from 1 to 20");
			int k=1;
			while(k<=21) {
			System.out.print(k + " ");
			 k+=2; 
			 }
			
			int n = 1;
			System.out.println("   I want to print odd numbers from 1 to 20  using if statement  A");
			while (n < 21) {if (n % 2 != 0) {
				System.out.println(n);
				} n++;
				}
			
			
			
			
		System.out.println("Another way to print odd numbers from 1-20 using if statement B");	//check this code which is on canvas
		int c=1;	
		while(c<21) {
			if (c%2!=0) {
				System.out.println(c);
		}
			c++;
	}
	}
}
