package com.syntax.review4;

public class ShortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//different ways to add 1
		
		int i=10;
		System.out.println(i);
		i=i+1;
		System.out.println(i);
		i+=1;
		System.out.println(i);
		i++;
		System.out.println(i);
		
		int x=10;
		System.out.println(++x+(++x)); //12+11
		
		int y=10;
		System.out.println(y++    +   y++); //10+11
	}

}
