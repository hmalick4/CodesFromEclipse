package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		while(i<7) {
			System.out.println("hello");
			i++;
		}
		
		System.out.println("----do while-----------");
		int j=1;
		do {
			System.out.println("Hello");
			j++;
		}while(j<=3);
		
		
		//print numbers 1-10 using do while loop
		int r=1;
				do {
					System.out.println(r);
					r++;
				}while (r<=10);
	}

}
