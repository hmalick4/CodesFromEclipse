package com.syntax.class07;

import java.util.Scanner;

public class MoreWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * ask name and age from three different users three times.
		 * then print name and age
		 */
		
		
		Scanner scan;
		String name;
		int age;
		
		int i=1;
		while (i<=3) {
			scan=new Scanner(System.in);
			System.out.println("Please enter your name");
			name=scan.nextLine();
		
			System.out.println(name+ " please enter your age.");
			age=scan.nextInt();
			System.out.println(name +" is " +age +" years old.");
			i++; //now it is a finite loop, not an infinte loop
	}
	}
}
