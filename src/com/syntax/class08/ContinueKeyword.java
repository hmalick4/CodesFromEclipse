package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=3; i++) {
			if (i==1) {
				continue;
			}
		System.out.println(i);

		}
		
		//i want to print all numers from 1 to 10, EXCEPT number 5 and 9
		for(int i=1; i<=10; i++) {
			if (i==5 || i==9) {
				continue;
			}
			System.out.print(i+" ");
		}
		
	}

}
