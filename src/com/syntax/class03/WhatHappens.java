package com.syntax.class03;

public class WhatHappens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int i=1.999//error bc need a whole number in int
		
		int i=(int)1.99;//narrowing or explicit casting
		System.out.println(i);
		
		double d=100;//wideing or implicit casting
		System.out.println(d); //interger value converted to double value. 
		
		byte b=(byte)128;//narrowing
		System.out.println(b);//output is negative 128)
				
		int num=20;
		int num1=3;
		System.out.println(num/num1);
			
		double num2=20;
		double num3=3; //conversion from int to double occurs
		System.out.println(num2/num3); //dividing two double values
		
		
		
	}

}
