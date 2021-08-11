package com.syntax.class10;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * create an array of double values using scanner.
		 * calculate the sum of all stored elements in that array.
		 */
		
						
		Scanner scan=new Scanner(System.in);
		double[] array;
		double sum=0.0;
				
		System.out.println("How many elements in your array?");
		int size=scan.nextInt();
		
		array=new double[size];
		
		for(int i=0; i<size; i++) {
			array[i]=scan.nextDouble();
			sum+=array[i];
		}
		double[] num=new double[size];
		for (double i=0; i<size; i++) {
			System.out.println("Please enter value to be stored in index.");
		}
		
		
		finishh!
		
		
	}

}
