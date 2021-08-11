package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=11;
		int num1=11;
		
		System.out.println(num>num1);
		System.out.println(num!=num1);
		System.out.println(num<num1);
		System.out.println(num==num1);
		System.out.println(num>=num1);
		
		int a=100;
		int b=190;
		
		boolean boo=a<b; //t/F answers
		System.out.println(boo);
		
		System.out.println("-------------");
		System.out.println(a==b); //false. checking for equality here
		System.out.println(a=b); //190 bc reassiging value of value b to a
		System.out.println();
	}

}
