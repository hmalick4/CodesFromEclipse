package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * i want to say hello five times.
		 */
		
		/*
		 * for (initialization of variable; condition; increment/decrement
		 */
		for (int i=1; i<=5; i++) {
			System.out.println(" A hello");
		}
		
		System.out.println(" B print numbers from 1-10");
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		//for(start; end; increment/decrement) {
			//System.out.println();
			//}
		
		System.out.println("C want to print numbers from 20 to 10");
		for(int i=20; i>=10; i--) {
			System.out.println(i+" ");
		}
		
		System.out.println("D want to print even numbers from 10 to 100");
		for(int i=10; i<=100; i+=2) {
			System.out.println(i+" ");
		}
		
		System.out.println(" E want to print even numbers from 10 to 100 with if condition");
		for(int i=10; i<=100; i++) {
			if (i%2==0 ) {
				System.out.println(i+ " ");
			} 
		}
			
		System.out.println("F want to print even numbers from 10 to 100");	
		for(int k=0; k<=101; k+=2) {
			System.out.println(k);
		}
	}
		
		
		}


