package com.syntax.review4;

public class ShortHandOperator3 {

	public static void main (String[] args) {
	
	int x=10;
	System.out.println(++x); //11. increment first, then print
	System.out.println(x++); //11. print FIRST, then increment
	System.out.println(x); //12. incremented from the previous line
}
}