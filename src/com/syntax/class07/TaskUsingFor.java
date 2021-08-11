package com.syntax.class07;

public class TaskUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-------task 1-------------");
		System.out.println("Print numbers from 1-100 in  1 line with a space.");

		for(int i=1; i<101; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("---------task2------------");
		System.out.println("print numbers from 100-1");
		for(int j=100; j>=1; j--) {
			System.out.println(j+" ");
		}
		
		
		System.out.println("-------------task3---------------");
		System.out.println("print even numbers from 20-1 two ways.");
		for(int k=20; k>=1; k-=2) {
			System.out.println(k);
		}
		System.out.println("second way to print even numbers from 20-1");
		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}

		
			
		//4. print odd numbers between 20-50 (2 ways)
		
		System.out.println("-------------task4---------------");

		System.out.println("first way printing odd numbers from 20-50");
		for (int m = 21; m <= 50; m += 2) {
			System.out.println(m + " ");
		}
		
		System.out.println("second way printing odd numbers from 20 to 50");
		for (int n = 20; n <= 50; n++) {
			if (n % 2 != 0) {
				System.out.print(n + " ");
			}
		
	
} } }