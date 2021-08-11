package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//print numbers 1-100 in one line with space
		
		System.out.println("-------------------task 1");
		int i=1;
				while (i<=100) {
					System.out.println(i +" ");
					i++;
				}
				
		
		System.out.println("------------task 2");
		//print numbers from 100-1
		int k=100;
				while(k>=1) {
					System.out.println(k);
					k--;
				}
		
				
		System.out.println("---------------task3");
		//print even numbers from 20-100
		int c=20;
		while (c<=100) {
			System.out.println(c);
			c+=2; //c=c+2
		}
		
		
		System.out.println("-----------------task 4");
		//print only odd numbers from 100-1
		
		int d=100;
		while (d>=1) {
			if (d%2!=0) {
				System.out.println(d);
			} d--;
		}
		
	}

}
