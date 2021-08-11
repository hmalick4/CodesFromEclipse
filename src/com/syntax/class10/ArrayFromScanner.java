package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Using scanner, create an array of integer elements.
		 */
		

		
		int[] array= {13};
		//array[1]=12;
		System.out.println(array.length);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many elements do you want to store inside your array?");
		int size=scan.nextInt();
		
		int[] numbers=new int[size];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Please enter value to be stored in index "+i);
			numbers[i]=scan.nextInt();
		}
		System.out.println("-----display all elements from an array------");
		for(int num:numbers) {
			System.out.println(num+" ");
		}
		
	}

}
