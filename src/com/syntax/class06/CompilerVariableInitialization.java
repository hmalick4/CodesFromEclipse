package com.syntax.class06;

import java.util.Scanner;

public class CompilerVariableInitialization {

	public static void main(String[] args) {

		/*
		 * ask user to enter name and age.
		 * based on age, define who is a user.
		 */
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Please enter your name.");
		String name=in.nextLine();
		
		System.out.println("Please enter your age.");
		int age=in.nextInt();
		
		String whoYouAre=null;//null is default value of any non primitive data type
		
		if (age>=0 && age<3) {
			whoYouAre="baby";
		}else if (age>=3 && age<6) {
			whoYouAre="toddler";		
		}else if (age>=6 && age<13) {
			whoYouAre="kid";
		}else if (age>=13 && age<20) {
			whoYouAre="teenager";
		}else if (age>=20 && age<65) {
			whoYouAre="adult";
		}else if (age>=65){
			whoYouAre="senior";
		}
		System.out.println(name+ ",you are "+whoYouAre);
	}

}
