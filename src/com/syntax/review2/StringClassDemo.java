package com.syntax.review2;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="Burj";
		String name2="Khalifa";
		System.out.println(name+ " "+name2);
		
		int number1=10;
		int number2=20;
		System.out.println(number1+number2);
		
		String sNumber="10";
		System.out.println(number1+sNumber); //prints as 1010 bc int becomes a string 
		
		System.out.println("Result of addition is " +number1+number2); //1020 bc becomes string
		System.out.println("Result of addition is " +(number1+number2)); //30 bc concotanation. parenthesis is analyzed by java first.
		
	}

}
