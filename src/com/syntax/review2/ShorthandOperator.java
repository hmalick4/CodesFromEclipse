package com.syntax.review2;

public class ShorthandOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1=10;
		int number2=5;
		int number3=(number1+number2);
		System.out.println(number3); //15
		number1=number1*10;
		
		System.out.println(number1);
		
		
		String line=("_____");
		System.out.println(line);
		
		int num=10;
		num+=20;
		System.out.println(num);
		num+=20+30;
		System.out.println(num);
		num+=num+50;
		System.out.println(num);
		
		
	}

}
